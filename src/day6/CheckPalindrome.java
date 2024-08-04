package day6;

public class CheckPalindrome {
	//Q6. Remove Junk or Special character from a String.
	public static void main(String[] args) {
		//Q5. Check to see if a string is a palindrome or not.
		String input = "Oracle";
		
		System.out.println("Given string is a palindrome = " + isPalindrome(i));
		String doubtfulInput = "This is my string with special characters :_*&^%$#@!";
		String result = doubtfulInput.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(result);
		
		
	}

	public static boolean isPalindrome(String str) {
		
		String reversed = "";
		for(int i = str.length()-1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		return str.equals(reversed);
		
	}
}
