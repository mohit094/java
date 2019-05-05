package Assignment_String;

public class arrays_shiftLeft {
	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[] = {1,2,3,4,5,6};
		arrayLeft(arr,5);
		
	}
	public static void arrayLeft(int arr[],int shiftLeft){
		int i = arr.length-1;
		int temp = arr[i];
		do{
			if(i<0) break;
			int indexValueToSave = i-shiftLeft;
			if(indexValueToSave<0){
				indexValueToSave=arr.length+indexValueToSave;
			}
			int temp2 = temp;
			temp = arr[indexValueToSave];
			arr[indexValueToSave] = temp2;
			i=i-shiftLeft;
			if(i<0){
				i=arr.length+i;
			}
			System.out.println("current value of I " + i);
			
		}while(i!=arr.length-1);
		
		for(int k = 0; k<arr.length; k++){
			System.out.print(arr[k] + " ");
		}
	}
}
