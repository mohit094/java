package L23;

import java.util.Scanner;

public class DP {

	public static int nthFibo(int n) {
		int fibo[] = new int[n+1];
		return fiboHelper(n, fibo);
	}

	private static int fiboHelper(int n, int[] fibo) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			fibo[1] = 1;
			return 1;
		}

		if(fibo[n] != 0) {
			return fibo[n];
		}

		if(fibo[n-1] == 0) {
			int a = fiboHelper(n-1, fibo);
			fibo[n-1] = a;
		}
		if(fibo[n-2] == 0) {
			int b = fiboHelper(n-2, fibo);
			fibo[n-2] = b;
		}

		fibo[n] = fibo[n-1] + fibo[n-2];
		return fibo[n];

	}

	public static int fiboIterative(int n) {
		int fibo[] = new int[n+1];
		fibo[1] = 1;
		for(int i = 2; i <= n; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		return fibo[n];
	}

	public static int minStepsToOne(int n) {
		if(n == 1) {
			return 0;
		}

		int a = minStepsToOne(n - 1);
		int b = Integer.MAX_VALUE, c = Integer.MAX_VALUE;
		if(n % 2 == 0) {
			b = minStepsToOne(n / 2);
		}
		if(n % 3 == 0) {
			c = minStepsToOne(n / 3);
		}

		return Math.min(a, Math.min(b, c)) + 1;
	}

	public static void main(String[] args) {
		
		//		Scanner s = new Scanner(System.in);
		String S = "abcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdef";
		String T = "gadhebgadhebgadhebgadhebgadhebgadhebgadhebgadhebgadhebgadhebgadhebgadheb";
		System.out.println(lcsBetter(S, T));

		//		int n = s.nextInt();
		//		System.out.println(numberOfBalanced(n));
	}

	public static int minStepsToOneBetter(int n) {
		int steps[] = new int[n+1];
		return minStepsHelper(n, steps);
	}

	private static int minStepsHelper(int n, int[] steps) {
		if(n == 1) {
			return 0;
		}

		if(steps[n-1] == 0) {
			int a = minStepsToOne(n - 1);
			steps[n-1] = a;
		}
		int b = Integer.MAX_VALUE, c = Integer.MAX_VALUE;

		if(n % 2 == 0) {
			if(steps[n/2] == 0) {
				b = minStepsToOne(n / 2);
				steps[n/2] = b;
			}
			else {
				b = steps[n/2];
			}
		}
		if(n % 3 == 0) {
			if(steps[n/3] == 0) {
				c = minStepsToOne(n / 3);
				steps[n/3] = c;
			}
			else {
				c = steps[n/3];
			}
		}

		steps[n] = Math.min(steps[n-1], 
				Math.min(b, c)) + 1;
		return steps[n];
	}

	public static int minStepsIter(int n) {
		int steps[] = new int[n+1];
		steps[0] = 0;
		steps[1] = 0;
		for(int i = 2; i <= n; i++) {
			int a, b = Integer.MAX_VALUE, c = Integer.MAX_VALUE;
			a = steps[i-1];
			if(i % 2 == 0) 
				b = steps[i/2];
			if(i % 3 == 0) 
				c = steps[i/3];
			steps[i] = Math.min(a, Math.min(b, c)) + 1;
		}
		return steps[n];
	}

	public static int numberOfBalanced(int h) {
		if(h == 0) {
			return 1;
		}
		if(h == 1) {
			return 1;
		}

		int x = numberOfBalanced(h - 1);
		int y = numberOfBalanced(h - 2);

		return (x*x + 2*x*y);

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
















}
