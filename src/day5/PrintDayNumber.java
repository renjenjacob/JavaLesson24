package day5;

public class PrintDayNumber {

	public static void main(String[] args) {
		
		String dayName = "Monday".toLowerCase();
		
		switch(dayName) {
		case "monday": {
			System.out.println("Day one");
			break;
		}
		case "tuesday": {
			System.out.println("Day two");
			break;
		}
		case "wednesday": {
			System.out.println("Day three");
			break;
		}
		case "thursday": {
			System.out.println("Day four");
			break;
		}
		case "friday": {
			System.out.println("Day five");
			break;
		}
		case "saturday": {
			System.out.println("Day six");
			break;
		}
		case "sunday": {
			System.out.println("Day six");
			break;
		}
		default: {
			System.out.println("Invalid day name!");
			return;
		}
		}

	}

}
