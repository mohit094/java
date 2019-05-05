package String;

public class reverseEachWord {
	
	public static void main(String[] args) {
		String str = reverseEachWord("My Name is khan");
		System.out.println(str);
	}
	public static String reverseEachWord(String input) {
		String[] arr = input.split("");
		int n = arr.length;
		for(int i = 0; i<(n-1)/2; i++){
			String temp = arr[n-1-i];
			arr[n-1-i] = arr[i];
			arr[i] = temp;
		}
		String str = "";
		
		for(String i : arr){
			str = str + i;
		}
		
		arr = str.split(" ");
		str = "";
		for(int i = arr.length-1; i>=0; i--){
			str = str + " "+arr[i];
		}
		
		return str;
	}
	
}
