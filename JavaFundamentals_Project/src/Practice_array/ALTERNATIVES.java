package Practice_array;

import java.util.ArrayList;

public class ALTERNATIVES {
	/*public static void rearrange(int arr[])
	{
		//Write code here 
		int i = 0;
		int j = 1;
		
		while(i<arr.length || j<arr.length){
			if(arr[i]<0 && i<arr.length){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j+=2;
			}
			else{
				i+=2;
			}
			if(arr[j]>0 && j<arr.length){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i+=2;
			}
			else{
				j+=2;
			}
		}
		int k = 0;
		while(k<arr.length){
			if(k%2 == 0){
				if(arr[k]<0){
					int temp = arr[k];
					arr[k] = arr[j];
					arr[j] = temp;
					j+=2;
				}
				else{
					i+=2;
					k++;
				}
			}
			else{
				if(arr[k]>0){
					int temp = arr[k];
					arr[k] = arr[i];
					arr[i] = temp;
					i+=2;
				}
				else{
					j+=2;
					k++;
				}
			}
		}*/
	public static void rearrange(int arr[])
	{
		ArrayList<Integer> pos = new ArrayList<Integer>();
		ArrayList<Integer> neg = new ArrayList<Integer>();
		
		for(int i : arr){
			if(i<0){
				neg.add(i);
			}
			else{
				pos.add(i);
			}
		}
		
		int k = 0;
		for(int i : pos){
			arr[k] = i;
			k+=2;
		}
		
		k = 1;
		
		for(int i : neg){
			arr[k] = i;
			k+=2;
		}
		
	}
}
