package Test2;

public class MinimumCount {
	public static void main(String[] args) {
		int count = minCount(13);
		System.out.println(count);
	}
	public static int minCount(int n){
		/* Your class should be named Solution
	 	 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		*/
		/*int highestMultiplier = 1;
		for(int i=1; i<=Math.sqrt(n); i++){
			if(n%(i*i) == 0){
				highestMultiplier = (i*i);
			}
		}
		int count = n/highestMultiplier;
		
		System.out.println(count);
		return count;*/
		if(n == 0){
			return 0;
		}
		int i = 0;
		for(i = n; i>1; i--){
			int k = (int) Math.sqrt(i);
			if((k*k) == i){
				break;
			}
		}
		if(i == 1){
			return n;
		}
		
		int count = 1 +  minCount(n-i);
		return count;
	}
}
