package Assignment_String;

public class wordStringReverse {
	public static void main(String[] args) {
		String str = "Welcome to Compro Technologies here";
		wordStringReverse(str);
		wordStringReverse2(str);
	}
	public static void wordStringReverse(String str1) {
		String []strArray = str1.split(" ");
		for(int i=0; i<=(strArray.length-1)/2;i++){
			System.out.println("Value at two positions :- "+ strArray[i] + " " + strArray[strArray.length-1-i]);
			String temp = strArray[i];
			strArray[i] = strArray[strArray.length-1-i];
			strArray[strArray.length-1-i] = temp;
		}
		String str2 = "";
		for (int j=0; j<strArray.length; j++){
			if(j == strArray.length-1){
				str2 = str2 + strArray[j];
				break;
			}
			str2 = str2 + strArray[j] +" ";
		}
		System.out.println(str2);
		
	}

	public static void wordStringReverse2(String str1) {
		String [] arr1 = str1.split(" ");
		
		for(int i = 0; i < (arr1.length-1)/2;i++){
			String temp = arr1[i];
			arr1[i] = arr1[arr1.length-1-i];
			arr1[arr1.length-1-i] = temp;
		}
		
		str1 = arr1[0];
		for(int i = 1; i < arr1.length;i++){
			str1 = str1 + " " + arr1[i];
		}
		System.out.println(str1);
	}
}
