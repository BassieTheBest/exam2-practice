package problem3;

public class Prob3 {

	public static void main(String[] args) {
		
		String str = reverseWords("Lexi you're in charge that nothing gross happens");
		System.out.println(str);
	}
	
	public static String reverseWords(String str) {
		String newStr = "";
		int index;
		int index2;
		int count = 0;
		String temp = "";
		String placeHolder = " ";
		String lastWord = "";
		
		
		for (index = 0; index < str.length(); index++) {
			if (str.charAt(index) != ' ') {
				temp += str.charAt(index);
				count++;
				lastWord = temp;
			}
			else {
				
				placeHolder += newStr;
				newStr = temp;
				newStr += placeHolder;
				placeHolder = " ";
				temp = "";
			}
			
		}
		placeHolder += newStr;
		newStr = lastWord + placeHolder;
		
		return newStr;
	}

}
