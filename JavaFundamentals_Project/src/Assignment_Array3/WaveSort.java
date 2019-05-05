package Assignment_Array3;

public class WaveSort {
	public static void main(String[] args) {
		int arr[] = {718,820,710};
		waveSort(arr);
	}
	public static void waveSort(int[] arr){
		//write your code here
		for(int i = 1; i<arr.length; i = i+2){
			if(i == arr.length-1){
				if(arr[i]>arr[i-1]){
//					swap(arr[i],arr[i-1]);
					int temp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = temp;
				}
			}
			else{
				if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
					if(arr[i-1]>arr[i+1]){
//						swap(arr[i],arr[i+1]);
						int temp = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = temp;
					}
					else{
//						swap(arr[i],arr[i-1]);
						int temp = arr[i];
						arr[i] = arr[i-1];
						arr[i-1] = temp;
					}
				}
				else if (arr[i]>arr[i+1]){
//					swap(arr[i],arr[i+1]);
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
				else if (arr[i]>arr[i-1]){
//					swap(arr[i],arr[i-1]);
					int temp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = temp;
				}
			}
		}
		for(int k=0;k<arr.length;k++){
			System.out.print(arr[k] + " ");
		}
	}
	public static void swap(int num1 , int num2){
		//write your code here
		int temp = num1;
		num1 = num2;
		num2 = temp;
	}
}
