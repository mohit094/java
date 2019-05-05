import java.util.Scanner;

public class sprinklerTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i = 1; i<=n; i++){
			int t = s.nextInt();
			for(int j = 1; j <= t; j++){
				if(j%15 == 0){
					System.out.println("FizzBuzz");
				}
				else if(j%5 == 0){
					System.out.println("Buzz");
				}
				else if(j%3 == 0){
					System.out.println("Fizz");
				}
				else{
					System.out.println(j);
				}
			}
		}
	}
}
