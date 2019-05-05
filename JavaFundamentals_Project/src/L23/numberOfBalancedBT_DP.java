package L23;

public class numberOfBalancedBT_DP {
	
	public static void main(String[] args) {
		int n = 2;
		int[] input = new int[n+1];
		System.out.println(numberOfBalanced_better(n,input));
		System.out.println(numberOfBalanced(n));
		System.out.println(numberOfBalanced_better_iterative(n));
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
	
	public static int numberOfBalanced_better(int h,int[] input) {
		if(h == 0) {
			return 1;
		}
		if(h == 1) {
			return 1;
		}
		
		int x = 0;
		int y = 0;
		if(input[h-1] == 0){
			x = numberOfBalanced_better(h - 1,input);
			input[h-1] = x;
		}
		
		x = input[h-1];
		
		if(input[h-2] == 0){
			y = numberOfBalanced_better(h - 2, input);
			input[h-2] = y;
		}
		
		y = input[h-2];

		return (x*x + 2*x*y);

	}
	
	public static int numberOfBalanced_better_iterative(int h) {
		int[] input = new int[h+1];
		if(h == 0 || h==1){
			return 1;
		}
		if(h==2){
			return 3;
		}
		
		input[1] = 1;
		input[2] = 3;
		
		for(int i = 3; i<=h; i++){
			int x = input[i-1];
			int y = input[i-2];
			int result = x*x + 2*x*y;
			input[i] = result;
		}
		
		return input[h];
	}


}
