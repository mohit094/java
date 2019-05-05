package Assignment_String;

public class rotateStringLeft {
	public static void main(String[] args) {
		String str = "This is awesome";
		rotateStringLeft(str,2);
	}
	public static void rotateStringLeft(String str1, int shiftLeft) {
		String[] arr = str1.split("");
		int i = arr.length-1;
		String temp = arr[i];
		System.out.println(arr[4]);
		do{
			if(i<0) break;
			int indexValueToSave = i-shiftLeft;
			if(indexValueToSave<0){
				indexValueToSave=arr.length+indexValueToSave;
			}
			String temp2 = temp;
			temp = arr[indexValueToSave];
			arr[indexValueToSave] = temp2;
			i=i-shiftLeft;
			if(i<0){
				i=arr.length+i;
			}
			
		}while(i!=arr.length-1);
		str1 = "";
		for (int t = 0; t < arr.length; t++){
			str1 = str1 + arr[t];
		}
		System.out.println(str1);
	}
}
