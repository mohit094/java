package Assignment_Array1;

public class pairSumArray {
	public static void main(String[] args) {
		int arr[] = {1,3,5,7,9,-1};
		pairSum(arr,8);
	}
	public static void pairSum(int [] arr,int n){
		for(int i = 0; i<arr.length-1; i++){
			int numberToFind = n-arr[i];
			for(int j = i+1; j<arr.length; j++){
				if (arr[j] == numberToFind){
					if(arr[j]>arr[i]){
						System.out.println(arr[i] + " " + arr[j]);
					}
					else{
						System.out.println(arr[j] + " " + arr[i]);
					}
				}
			}
			
		}
	}
}
