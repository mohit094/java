package Assignment_String;

public class checkArrayRotation {
	public static void main(String[] args) {
		int arr[] = {5,6,0,1,2,3,4};
		checkArrayRotation(arr);
	}
	public static void checkArrayRotation(int arr[]) {
		int rotation = 0;
		for(int i = 0; i<arr.length-1; i++){
			if(arr[i]>arr[i+1]){
				rotation = i+1;
				break;
			}
		}
		System.out.println(rotation);
	}
		
}
