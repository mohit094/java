package L23;

public class longestCommonSubsequence_DP {
	
	public static void main(String[] args) {
		/*String S = "abcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdef";
		String T = "gadhebgadhebgadhebgadhebgadhebgadhebgadhebgadhebgadhebgadhebgadhebgadheb";
		lcsBetter_Iteratively(S,T);
		System.out.println(lcsBetter(S,T));*/
		String s1 = "abcdef";
		String s2 = "azced";
		int t = lcs(s1,s2);

	}
	
	public static int lcs(String s, String t) {
		if(s.length() == 0 || t.length() == 0) {
			return 0;
		}

		if(s.charAt(0) == t.charAt(0)) {
			return lcs(s.substring(1), t.substring(1)) + 1;
		}
		else {
			int a = lcs(s.substring(1), t.substring(1));
			int b = lcs(s, t.substring(1));
			int c = lcs(s.substring(1), t);
			return Math.max(a, Math.max(b, c));
		}
	}

	public static int lcsBetter(String s, String t) {
		int m = s.length();
		int n = t.length();
		int lcs[][] = new int[m+1][n+1];
		for(int i = 0; i <= m; i++) {
			for(int j = 0; j <= n; j++) {
				lcs[i][j] = -1;
			}
		}
		return lcsHelper(s, t, lcs);
	}

	private static int lcsHelper(String s, String t, int[][] ans) {
		int m = s.length();
		int n = t.length();
		if(m == 0 || n == 0) {
			ans[m][n] = 0;
			return 0;
		}
		if(ans[m][n] != -1) {
			return ans[s.length()][t.length()];
		}
		if(s.charAt(0) == t.charAt(0)) {
			if(ans[m-1][n-1] == -1) {
				ans[m-1][n-1] = lcsHelper(s.substring(1), t.substring(1), ans);
			}
			ans[m][n] = ans[m-1][n-1] + 1;
		}
		else {
			if(ans[m-1][n-1] == -1) {
				ans[m-1][n-1] = lcsHelper(s.substring(1), t.substring(1), ans);
			}
			
			if(ans[m-1][n] == -1) {
				ans[m-1][n] = lcsHelper(s.substring(1), t, ans);
			}
			
			if(ans[m][n-1] == -1) {
				ans[m][n-1] = lcsHelper(s, t.substring(1), ans);
			}
			ans[m][n] = Math.max(ans[m-1][n-1], 
					Math.max(ans[m-1][n], ans[m][n-1]));
		}
		
		return ans[m][n];

	}
	
	
	public static void lcsBetter_Iteratively(String s, String t) {
		int m = s.length();
		int n = t.length();
		int[][] input = new int[m+1][n+1];
		for(int i =0;i==0;i++){
			for(int j = 0; j<n+1; j++){
				input[i][j] = 0;
			}
		}
		for(int i =0;i==0;i++){
			for(int j = 0; j<m+1; j++){
				input[j][i] = 0;
			}
		}
		
		for(int i = 1;i<m+1;i++){
			for(int j = 1; j<n+1; j++){
				input[i][j] = -1;
			}
		}
		
		for(int i = 1;i<m+1;i++){
			for(int j = 1; j<n+1; j++){
				//
				if(s.charAt(i-1) == t.charAt(j-1)){
					int ans = input[i-1][j-1];
					input[i][j] = ans+1;
				}
				else{
					int x = input[i][j-1];
					int y = input[i-1][j];
					
					int ans = Math.max(x, y);
					input[i][j] = ans;
				}
			}
		}
		
		System.out.println(input[m][n]);
		
	}

}
