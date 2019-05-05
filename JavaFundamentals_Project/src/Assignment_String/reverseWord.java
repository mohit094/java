package Assignment_String;

public class reverseWord {
	public static void main(String[] args) {
		String str = "Welcome to Compro Technologies";
		reverseWord(str);
	}
	public static void reverseWord(String str1) {
		String [] strArray = str1.split("");
		for (int i =0; i< (strArray.length)/2; i++){
			String temp = strArray[i];
			strArray[i] = strArray[strArray.length-1-i];
			strArray[strArray.length-1-i] = temp;
		}
		String str2 = "";
		for (int i = 0; i<strArray.length; i++){
			str2 = str2 + strArray[i];
		}
		
		String [] strArray2 = str2.split(" ");
		for (int i =0; i< (strArray2.length)/2; i++){
			String temp = strArray2[i];
			strArray2[i] = strArray2[strArray2.length-1-i];
			strArray2[strArray2.length-1-i] = temp;
		}
		
		str2 = "";
		for (int j=0; j<strArray2.length; j++){
			if(j == strArray2.length-1){
				str2 = str2 + strArray2[j];
				break;
			}
			str2 = str2 + strArray2[j] +" ";
		}
		System.out.println(str2);
		
	}	
}
