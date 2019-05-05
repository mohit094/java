package Assignment_Array2;

public class binarySearch {
	public static void main(String[] args) {
		int arr[] = {4,5,6,7,10};
		binarySearch(arr,5);
	}
	public static int binarySearch(int[] arr, int num){
		//write your code here
		int index = -1;
		int i = 0;//start index
		int j = arr.length-1;//end index
		while(i<=j){
			int k = (i+j)/2;
			if(arr[k] == num){
				index = k;
				break;
			}
			else if(arr[k]>num){
				j = k-1;
			}
			else{
				i = k+1;
			}
		}
		return index;
		
	}
}
