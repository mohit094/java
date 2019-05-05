package Assignment_Array2;

public class sort012 {
	public static void main(String[] args) {
		int arr[] = {2,1,0,1,1,0,0,1,2,0,2,2,0,0,1,0};
		sortBinaryArray(arr);
	}
	public static void sortBinaryArray(int[] arr){
		//write your code here
		int startIndexOf1 = 0;
		int endIndexOf1 = arr.length-1;
		for(int i=0; i<arr.length; i++){
			if(arr[i]==0){
				int temp = arr[i];
				arr[i] = arr[startIndexOf1];
				arr[startIndexOf1] = temp;
				startIndexOf1++;
			}
			if(arr[i]==2 && arr[endIndexOf1] ==0){
				int temp = arr[endIndexOf1];
				arr[endIndexOf1] = arr[startIndexOf1];
				arr[startIndexOf1] = temp;
				startIndexOf1++;
				temp = arr[i];
				arr[i] = arr[endIndexOf1];
				arr[endIndexOf1] = temp;
				endIndexOf1--;
			}
			else if(arr[i]==2 && arr[endIndexOf1] ==2){
				endIndexOf1--;
				int temp = arr[i];
				arr[i] = arr[endIndexOf1];
				arr[endIndexOf1] = temp;
				endIndexOf1--;
			}
			else if(arr[i]==2 && endIndexOf1>i){
				int temp = arr[i];
				arr[i] = arr[endIndexOf1];
				arr[endIndexOf1] = temp;
				endIndexOf1--;
			}
		}
		for(int k =0;k<=arr.length-1;k++){
			System.out.print(arr[k]+" ");
		}
	}
}
