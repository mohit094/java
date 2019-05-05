package Assignment_String;

public class stringInAString {
	public static void main(String[] args) {
		String str1 = "ohMoitoh";
		String str2 = "oh";
		stringInAString(str1,str2);
	}
	public static void stringInAString(String text,String pattern) {
		int index = -1;
		for(int i = 0; i<text.length(); i++){
			if(pattern.charAt(0)==text.charAt(i) && i+pattern.length()<=text.length()){
				String str3 = text.substring(i,i+pattern.length());
				if(pattern.equals(str3)){
					index = i;
					break;
				}
			}
		}
		System.out.println(index);
	}	
}
