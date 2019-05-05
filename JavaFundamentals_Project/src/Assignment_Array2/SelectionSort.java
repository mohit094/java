package Assignment_Array2;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = {4,5,6,7,1,2,3,10};
		selectionSort(arr);
	}
	public static void selectionSort(int arr[]) {
		for(int i = 0; i<arr.length-1;i++){
			int minNumber = arr[i];
			int indexOfMinNumber = i;
			for (int j = i; j<=arr.length-1;j++){
				if(arr[j]<minNumber){
					minNumber = arr[j];
					indexOfMinNumber = j;
				}
			}
			if(indexOfMinNumber!=i){
				arr[indexOfMinNumber] = arr[i];
				arr[i] = minNumber;
			}
		}
		for(int k =0;k<=arr.length-1;k++){
			System.out.print(arr[k]+" ");
		}

	}
}
