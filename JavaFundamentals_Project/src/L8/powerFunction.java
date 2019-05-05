package L8;
import java.util.Scanner;
import java.lang.Math;

public class powerFunction {
	public static void main (String[] args){
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = s.nextInt();
		
		int finalAnswer = power(x,n);
		System.out.println(finalAnswer);
	}
	
	public static int power(int x,int n){
		if(n==0){
			return 1;
		}
		if(x==0){
			return 0;
		}
		int value = x * power(x,n-1);
		return value;
	}
}


