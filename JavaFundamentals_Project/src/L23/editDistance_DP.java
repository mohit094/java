package L23;

public class editDistance_DP {
	public static void main(String[] args) {
		String s = "xbc";
		String t = "yabc";
		
		int[][] input = new int[s.length() + 1][t.length()+1];
		for(int i = 0; i<=s.length();i++){
			for(int j = 0; j<=t.length(); j++){
				input[i][j] = -1;
			}
		}
		
		System.out.println(minimumOperation(s,t,input));
		
	}
	public static int minimumOperation(String s, String t, int[][] input){
		if(s.length() == 0 || t.length() == 0){
			int n = s.length() + t.length();
			input[s.length()][t.length()] = n;
			return n;
		}
		int i = s.length();
		int j = t.length();
		
		if(s.charAt(0) == t.charAt(0)){
			if(input[i-1][j-1] != -1){
				
				input[i][j] = input[i-1][j-1];
				
			}
			else{
				input[i-1][j-1] = minimumOperation(s.substring(1),t.substring(1),input);
			}
			
			input[i][j] = input[i-1][j-1];
			
			int ans = input[i][j];
			
			return ans;
		}
		else{
			//insertion
			int x = minimumOperation(s,t.substring(1),input);
			//deletion-removal
			int y = minimumOperation(s.substring(1),t,input);
			//replace
			int z = minimumOperation(s.substring(1),t.substring(1),input);
			
			int ans = Math.min(x, Math.min(y, z)) + 1;
			
			input[i][j] = ans;
			
			return ans;
		}
	}
}
