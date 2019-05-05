package Assignment_Array2;

public class sort0_1 {
	public static void main(String[] args) {
		int arr[] = {0,1,0,1,1,0,0,1};
		sortBinaryArray(arr);
	}
	public static void sortBinaryArray(int[] arr){
		//write your code here
		int indexOf1 = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]==0){
				int temp = arr[i];
				arr[i] = arr[indexOf1];
				arr[indexOf1] = temp;
				indexOf1++;
			}
		}
		for(int k =0;k<=arr.length-1;k++){
			System.out.print(arr[k]+" ");
		}
	}
}
