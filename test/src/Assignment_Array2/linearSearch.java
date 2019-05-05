package Assignment_Array2;

public class linearSearch {
	public static void main(String[] args) {
		int arr[] = {4,5,6,7,1,2,3,10};
		linearSearch(arr,5);
	}
	public static int linearSearch(int[] arr, int num){
		//write your code here
		int index = -1;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == num){
				index = i;
			}
		}
		return index;
	}
}
