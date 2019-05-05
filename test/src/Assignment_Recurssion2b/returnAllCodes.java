package Assignment_Recurssion2b;

public class returnAllCodes {
	public static void main(String[] args) {
		String[] array = getCode("10333");
		for(int n = 0; n<array.length; n++){
			System.out.println(array[n]);
		}
	}
	public static  String[] getCode(String input){
		// Write your code here
		String[] alphabet = {"`","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r",
				"s","t","u","v","w","x","y","z"};
		if(input.length() == 0){
			String[] arr = {};
			return arr;
		}
		int num1 = Integer.parseInt(input.substring(0,1));
			
		if(input.length() == 1){
			String[] arr = {alphabet[num1]};
			return arr;
		}
		int num2 = Integer.parseInt(input.substring(0,2));
		
		if(input.length() == 2){
		  int num3 = Integer.parseInt(input.substring(1,2));
		  if(num1!=0 && num2<27){
			  String arr3[] = {alphabet[num1] + alphabet[num3],alphabet[num2]};
			  return arr3;  
		  }
		  else{
			  String arr3[] = {alphabet[num1] + alphabet[num3]};
			  return arr3;  
		  }
		  
		}
		
		String []arr1 = getCode(input.substring(1));
	
		
		for(int i = 0; i<arr1.length; i++){
			arr1[i] =  alphabet[num1] + arr1[i];
		}
		
		
		if(num1!=0 && num2<27){
			String []arr2 = getCode(input.substring(2));
			for(int k = 0; k<arr2.length; k++){
				arr2[k] = alphabet[num2] + arr2[k];
			}
			String [] finalArray = new String[arr1.length + arr2.length];
			int j = 0;
			for(j = 0; j<arr1.length; j++){
				finalArray[j] = arr1[j];
			}
			for(int t = 0; t < arr2.length; t++,j++){
				finalArray[j] = arr2[t];
			}
			
			return finalArray;
		}
		
		return arr1;
	}
}
