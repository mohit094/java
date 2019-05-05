package Assignment_Recurssion2a;

public class returnSubsequenceOfString {
	public static void main(String[] args) {
		subsequence("abc");
	}
	public static String[] subsequence(String input){
		// Write your code here
		if(input.length() == 0){
			String[] returnString = {""};
			return returnString;
		}
		String[] test1 = subsequence(input.substring(1));
		String[] test2 = new String[test1.length*2];
		int i = 0;
		for(i = 0;i<test1.length;i++){
			test2[i] = test1[i];
		}
		for(int k = 0;i<test2.length;i++,k++){
			test2[i] = input.charAt(0) + test1[k];
		}
/*		for(int t = 0;t<test2.length;t++){
			System.out.println(test2[t]);;
		}*/
		return test2;
	}
}
