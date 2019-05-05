package Assignment_Array2;

public class insertionSort {
	public static void main(String[] args) {
		int arr[] = {4,5,6,7,1,2,3,10};
		insertionSort(arr);
	}
	public static void insertionSort(int arr[]) {
		for(int i=1;i<=arr.length-1;i++){
			int indexToPlace = i;
			for(int j=i;j>=0;j--){
				if(arr[j]>arr[indexToPlace]){
					int temp = arr[indexToPlace];
					arr[indexToPlace] = arr[j];
					arr[j] = temp;
					indexToPlace = j;
				}
			}
		}
		for(int k =0;k<=arr.length-1;k++){
			System.out.print(arr[k]+" ");
		}
	}
}
