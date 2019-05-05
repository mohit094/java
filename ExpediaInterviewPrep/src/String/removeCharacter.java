package String;

public class removeCharacter {
	
	public static String removeAllOccurrencesOfChar(String input, char c) {
		StringBuilder n = new StringBuilder();
		for(int i = 0; i <input.length(); i++){
			if(input.charAt(i)!=c){
				n.append(input.charAt(i));
			}
		}
		input = n.toString();
		
		return input;
	}
	
}
