import java.util.Scanner;

public class strings {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String n = s.nextLine();
		
//		substring(n);
//		removeDuplicate(n);
		stringReverse(n);
		
	}
	
	public static void substring (String s){
		int a = s.length();
		for(int j = 0; j<a; j++){
			for(int i = j+1;i<a+1;i++){
				String value = s.substring(j,i);
				System.out.println(value);
			}
		}
		
	}
	
	public static void removeDuplicate (String s){
		int a = s.length();
		String newString = s.charAt(0)+"" ;
		for (int i = 1; i<a; i++){
			if(s.charAt(i)!=s.charAt(i-1)){
				
				newString = newString + s.charAt(i);
			}
		}
		System.out.println(newString);
	}
	
	public static void stringReverse(String s){
		
		String newString[] = s.split(" ");
		int a = newString.length;
		for(int i=0,j=a-1;i<j;i++,j--){
			String temp = newString[i];
			newString[i] = newString[j];
			newString[j] = temp;
		}
//		System.out.println(newString);
		String finalString = "";
//		int b = newString
		for (int k = 0; k<a; k++){
//			finalString += newString[k] + " ";
			finalString =  finalString.concat(" ");
			finalString =  finalString.concat(newString[k]);
			
		}
		
		System.out.println(finalString);
		
	}
	
	
}
