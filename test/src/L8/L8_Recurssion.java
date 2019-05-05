package L8;
import java.util.Scanner;
import java.lang.Math;

public class L8_Recurssion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int value = s.nextInt();
/*		int answer = fact(value);
		System.out.println(answer);*/
		
		int answer2 = fibo(value);
		System.out.println(answer2);

	}
	public static int fact(int n){
		if(n==0){
			return 1;
		}
		int a = fact(n-1);
		int ans=n*a;
		return ans;
	}
	
	public static int fibo (int n){
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		
		int answer = fibo(n-1)+fibo(n-2);
		
		return answer;
	}
}
