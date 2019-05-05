package Recurssion;

public class quickSortCode {
	public static void main(String[] args) {
		int[] input = {6,4,7,3,8,2,9,1};
		quickSort(input);
		for(int i : input){
			System.out.print(i + " ");
		}
	}
	public static void quickSort(int[] input){
		quickSort(input,0,input.length-1);
	}
	public static void quickSort(int[] input, int si, int ei){
		if(ei== si || ei<si){
			return;
		}
		
		int j = partition(input,si,ei);
//		System.out.println(si + " " + ei + " " + j );
		quickSort(input,si,j-1);
		
		quickSort(input,j+1,ei);
	}
	
	public static int partition(int[] input, int si, int ei){
		int pivot = input[si];
		int count = 0;
		for(int i = si+1; i<=ei; i++){
			if(input[i]<pivot){
				count++;
			}
		}
		swap(input[si],input[si+count]);
		int i = si;
		int j = si + count + 1;
		System.out.println(i + " " + input[i] + " " + input[j] + " " + j);
		while(i<si+count){
			if(input[i]<=pivot && input[j]>pivot){
				i++;
				j++;
			}
			else if(input[i]>pivot && input[j]<=pivot){
				swap(input[i],input[j]);
				i++;
				j++;
			}

			else if(input[i]<=pivot && input[j]<=pivot){
				i++;
			}
			else{
				j++;
			}
		}
		
		for(int t : input){
			System.out.print(t + " ");
		}
		
		int pivotIndex = si + count;
		
		return pivotIndex;
	}
	
	public static void swap(int i, int j){
		System.out.println("swap" + i + " " + j);
		int temp = i;
		i = j;
		j = temp;
	}
	
	


}
