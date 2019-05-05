package Assignment_Array1;

public class arrayReverse {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		reverseArray(arr);
	}
	public static void reverseArray(int [] arr){
		for(int i = 0; i <= (arr.length-1)/2; i++){
			int temp = arr[arr.length-1-i];
			arr[arr.length-1-i] = arr[i];
			arr[i] = temp;
		}
		for(int i = 0; i <= arr.length-1; i++){
			System.out.print(arr[i]);
		}
	} 
}
