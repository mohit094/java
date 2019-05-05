package Assignment_String;

public class changeCase {
	public static void main(String[] args) {
		changeCase("My name is Mohit Khanna");
	}
	public static void changeCase(String inputString) {
		inputString = inputString.toLowerCase();
		System.out.println(inputString);
	}	
}
