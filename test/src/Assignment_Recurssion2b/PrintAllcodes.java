package Assignment_Recurssion2b;

public class PrintAllcodes {
	public static void main(String[] args) {
		printAllPossibleCodes("1033");
	}
	public static void printAllPossibleCodes(String input) {
		// Write your code here
		printAllPossibleCodes2(input,"");
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r",
		"s","t","u","v","w","x","y","z"}; 
        
	}
	public static void printAllPossibleCodes2(String input, String Output) {
		// Write your code here
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r",
				"s","t","u","v","w","x","y","z"};
        if(input.length() == 0){
            System.out.println(Output);
            return;
        }
        int num1 = Integer.parseInt(input.substring(0,1));
        if(num1!=0){
        	printAllPossibleCodes2(input.substring(1), Output + alphabet[num1-1]);
        	if(input.length()>1){
            	int num2 = Integer.parseInt(input.substring(0,2));
            	if(num2<=26 && num2>0){
            		printAllPossibleCodes2(input.substring(2), Output + alphabet[num2-1]);
            	}
            }
        }
        else{
        	printAllPossibleCodes2(input.substring(1), Output + "`");
        }
	}
}
