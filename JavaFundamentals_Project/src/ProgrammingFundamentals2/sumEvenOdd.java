package ProgrammingFundamentals2;

import java.util.Scanner;

public class sumEvenOdd {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int o = 0, e = 0;
		while(n/10 != 0){
			int temp = n%10;
			if(temp%2 == 0){
				e = e + temp;
			}
			else{
				o = o + temp;
			}
			n = n/10;
		}
		
		if(n%2 == 0){
			e = e + n;
		}
		else{
			o = o + n;
		}
		
		System.out.println(o + " " + e);
	}
}
