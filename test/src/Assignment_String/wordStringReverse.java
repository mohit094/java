package Assignment_String;

public class wordStringReverse {
	public static void main(String[] args) {
		String str = "Welcome to Compro Technologies here";
		wordStringReverse(str);
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
}
