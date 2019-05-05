package L23;

public class totalNumerOfSteps {
	public static void main(String[] args) {
		int n = 5;
		int[] input = new int[n+1];
		System.out.println(totalNumberHelper(n,input));
		totalNumberIter(n);
	}

	public static int totalNumberHelper(int n, int[] input){
		if(n == 1){
			input[1] = 1;
			return 1;
		}
		if(n == 2){
			input[2] = 2;
			return 2;
		}
		if(n == 3){
			input[3] = 4;
			return 4;
		}
		int a,b,c;
		
		if(input[n-3] == 0){
			a = totalNumberHelper(n-3,input);
			input[n-3] = a;
		}
		else{
			a = input[n-3];
		}
		
		
		if(input[n-2] == 0){
			b = totalNumberHelper(n-2,input);
			input[n-2] = b;
		}
		else{
			b = input[n-2];
		}
		
		
		if(input[n-1] == 0){
			c = totalNumberHelper(n-1,input);
			input[n-1] = c;
		}
		else{
			c = input[n-1];
		}
		
		int finalValue = a + b + c;
		
		input[n] = finalValue;
		
		return finalValue;
	}

	public static void totalNumberIter(int n){
		int[] input = new int[n+1];
		
		input[0] = 0;
		input[1] = 1;
		input[2] = 2;
		input[3] = 4;
		
		for(int i = 4; i <= n; i++){
			int a = input[i-3];
			int b = input[i-2];
			int c = input[i-1];
			
			input[i] = a + b + c;
		}
		
		System.out.println(input[n]);
	}
}
