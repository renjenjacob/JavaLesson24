package day2;

public class IfCondition {

	public static void main(String[] args) {
		/* Conditional Statements
		 * 
		 * if
		 * if else
		 * switch statement
		 * 
		 */

		/*
		 * if(boolean condition)
		 * {
		 * block of code or statement
		 * }
		 * 
		 * 
		 */
		
		//Example 1:
		if(true) {
			System.out.println("We speak the truth.");
		}
		
		//Example 2
		int person_age = 25;
		if(person_age >= 18) {
			System.out.println("Eligible to vote.");
		}else {
			System.out.println("Not Eligible to vote.");
		}
		
		System.out.println("End of the program.");
	}
		
}
