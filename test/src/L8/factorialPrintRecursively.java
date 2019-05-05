package L8;

public class factorialPrintRecursively {
	public static void main(String[] args) {
		int n = 5;
		factorial(n,1);
	}
	public static void factorial(int n, int output) {
		if(n == 0){
			System.out.println(output);
			return;
		}
		int a = n*output;
		factorial(n-1,a);
	}
}
