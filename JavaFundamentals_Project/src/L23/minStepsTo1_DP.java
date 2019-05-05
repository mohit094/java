package L23;

public class minStepsTo1_DP {
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

}
