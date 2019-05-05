package Assignment_Recurssion2a;

class checkAB {
	public static void main(String[] args) {
		boolean  value = checkStringWithAandB("");
		System.out.println(value);
	}
	public static boolean checkStringWithAandB(String input){
		// Write your code here
		if(input.length()<1){
			return false;
		}
		if(input.length() == 1){
			if(input.charAt(0) == 'a') return true;
			else return false;
		}
		boolean value = false;
		if(input.charAt(0) == 'a'){
			if(input.charAt(1) == 'a'){
				value = checkStringWithAandB(input.substring(1));
			}
			else if (input.charAt(1) == 'b' && input.charAt(2) == 'b'){
				if(3 == input.length()){
					value = true;
				}
				else{
					value = checkStringWithAandB(input.substring(3));
				}
			}
			else{
				value =  false;
			}
		}
		else{
			value = false;
		}
		return value;

	}
}
