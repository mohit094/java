package L8;

public class SumOf1toN {
	
	public static int sum(int n){
		if (n==0){
			return 0;
		}
		
		int ans = n + sum(n-1);
		return ans;
	}
	
	public static void main(String[] args){
		int answer = sum(0);
		System.out.println(answer);
	}
	
}
