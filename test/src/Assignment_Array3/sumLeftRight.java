package Assignment_Array3;

public class sumLeftRight {
	public static void main(String[] args) {
		int arr[] = {-7,1,5,2,-4,3,0};
		sumLeftRight(arr);
	}
	public static void sumLeftRight(int arr[]) {
		int sumRight = 0,sumLeft = 0;
		int index = 0;
		for(int i = 0 ;i < arr.length; i++){
			sumRight = sumRight + arr[i];
		}
		for(int k = 0; k<arr.length; k++){
			if(k == 0){
				sumRight = sumRight - arr[k];
				if(sumLeft == sumRight){
					index = 0;
					break;
				}
			}
			else if(k == arr.length-1){
				sumLeft = sumLeft + arr[k-1];
				sumRight = 0;
				if(sumLeft == sumRight){
					index = k;
					break;
				}
			}
			else {
				sumLeft = sumLeft + arr[k-1];
				sumRight = sumRight - arr[k];
				if(sumLeft == sumRight){
					index = k;
					break;
				}
			}
		}
		System.out.println(index);
		
	}
}
