package Assignment_Array1;

public class triplet_sum {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		triplet(arr,12);
	}
	public static void triplet(int[] arr, int num){
		int numb1,numb2;
		for(int k = 0; k<arr.length-2; k++){
			numb1 = arr[k];
			int numberTofind = num-arr[k];
			for(int i = k+1; i<arr.length-1; i++){
				numb2 = arr[i];
				if(arr[k]>arr[i]){
					numb1 = arr[i];
					numb2 = arr[k];							
				}
				int numberToFind2 = numberTofind-arr[i];
				for(int j = i+1; j<arr.length; j++){
					if (arr[j] == numberToFind2){
						if(arr[j]>numb2){
							System.out.println(numb1 + " " + numb2 + " " + arr[j]);
						}
						else if(arr[j]<numb2 && arr[j]>numb1){
							System.out.println(numb1 + " " + arr[j] + " " + numb2);
						}
						else if(arr[j]<numb1){
							System.out.println(arr[j] + " " + numb1 + " " + numb2);
						}
					}
				}
				
			}
		}
	}
}
