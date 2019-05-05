package Assignment_Array1;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class FindUniqueElement {
	public static void main(String[] args) {
		int[] arr = {5,5,4,4,3,3,2,2,0,1,1};
		sort(arr);
	}
	public static void sort(int arr[]){
		/*for(int i = 1; i<arr.length; i++){
			int k = i;
			for(int j =i-1; j>=0; j--){
				if(arr[k]<arr[j]){
					int temp = arr[k];
					arr[k] = arr[j];
					arr[j] = temp;
					k = j;
				}
			}
		}
		int unique = -1;
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]);
		}
		System.out.println();
		for(int j=0;j<arr.length-2;j=j+2){
			if(arr[j]!=arr[j+1]){
			    unique = arr[j];
			    break;
			}
		}
		System.out.println(unique);*/
		int unique = -1;
		for(int i = 0; i<arr.length; i++){
			int k = 0;
			for(int j = 0; j<arr.length;j++){
				if(arr[j]==arr[i]){
					k++;
					if(k==2){
						break;
					}
				}
			}
			if(k==1){
				unique = arr[i];
				break;
			}
		}
		System.out.println(unique);
		
	}
}
