package Assignment_Recurssion2b;

public class returnKeypad {
	public static void main(String[] args) {
		String[] arr = keypad(23);
		for(int i = 0;i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	public static String[] keypad(int n){
		// Write your code here
        String[] charList = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(n/10 == 0){
        	String [] arr = new String[charList[n].length()];
        	for(int i = 0; i < arr.length; i++){
        		arr[i] = Character.toString(charList[n].charAt(i));
        	}
        	return arr;
        }
        int value = n%10;
        String[] arr1 = keypad(n/10);
        String[] finalArray = new String[arr1.length*charList[value].length()];
        int m = 0, count = 1;
        for(int i = 0; i<charList[value].length(); i++){
        	for(int k = 0; k<arr1.length; k++){
        		finalArray[m] = arr1[k] + Character.toString(charList[value].charAt(i));
        		m++;
        	}
        }
        return finalArray;
	}
}
