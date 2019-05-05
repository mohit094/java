package Assignment_String;

public class removeCharacter {
	public static void main(String[] args) {
		String str = "I am here";
		removeCharacter(str,'e');
	}
	public static void removeCharacter(String input, char c) {
		String [] arr = input.split("");
		for(int i=0; i<arr.length;i++){
			if(arr[i].equals(String.valueOf(c))){
				arr[i] = "";
			}
		}
		input = "";
		for (int t = 0; t < arr.length; t++){
			input = input + arr[t];
		}
		System.out.println(input);
	}
}
