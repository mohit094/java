package Assignment_Array3;

public class sumPositiveNegative {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,-1,-2,-3,-4,5,6};
		sumPositiveNegative(arr);
	}
	public static void sumPositiveNegative(int arr[]) {
		int sumPositive = 0;
		int sumNegative = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i]>=0){
				sumPositive = sumPositive + arr[i];
			}
			else{
				sumNegative = sumNegative + arr[i];
			}
		}
		System.out.println(sumPositive);
		System.out.println(sumNegative);
	}
		
}
