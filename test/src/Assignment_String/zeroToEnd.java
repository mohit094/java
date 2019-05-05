package Assignment_String;

public class zeroToEnd {
	public static void main(String[] args) {
		int arr[] = {1,2,3,0,0,4,6,8,0,0,32,0,5};
		zeroToEnd(arr);
	}
	public static void zeroToEnd(int arr[]) {
		int numberOfZeros = 0;
		for(int i = 0; i<arr.length; i++){
			if(arr[i] == 0){
				numberOfZeros++;
			}
		}
		if(numberOfZeros != 0){
			int t = 0;
			for (int k = 0; k<arr.length; k++ ){
				if (arr[k] != 0){
					arr[t] = arr[k];
					t++;
				}
			}
			while(t<arr.length){
				arr[t] = 0;
				t++;
			}
			
		}
		for(int g = 0; g < arr.length; g++){
			System.out.print(arr[g] + " ");
		}
	}
}
