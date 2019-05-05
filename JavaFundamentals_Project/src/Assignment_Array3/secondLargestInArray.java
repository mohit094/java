package Assignment_Array3;

public class secondLargestInArray {
	public static void main(String[] args) {
		
	}
	public static void secondLargestElement(int[] arr) {
		//write your code here
		int largest = Integer.MIN_VALUE,secondLargest = largest+1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largest){
				secondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i]>secondLargest){
				secondLargest = arr[i];
			}
		}
	}
}
