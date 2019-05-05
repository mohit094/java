package Assignment_String;

public class duplicateNumberInArray {
	public static void main(String[] args) {
		int arr[] = {0,1,2,3,4,3};
		duplicateNumber(arr);
	}
	public static void duplicateNumber(int arr[]) {
		int arr2[] = new int[arr.length-1];
		for(int i = 0; i<arr.length; i++){
			arr2[arr[i]] = arr2[arr[i]]+1;
		}
		for(int i = 0; i<arr2.length; i++){
			if(arr2[i] == 2){
				System.out.println(i);
				break;
			}
		}
	}
	
}
