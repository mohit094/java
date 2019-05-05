package L23;

public class fibonacci_DP {
	
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

}
