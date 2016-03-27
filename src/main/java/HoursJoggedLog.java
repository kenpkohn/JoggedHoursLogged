
// Import the scanner class
import java.util.*;

public class HoursJoggedLog {

	static int days_jogged;
	static int hours_jogged;
	// Creating the class variable of the scanner object to allow user input
	static Scanner scanner = new Scanner(System.in);
	// Initialize the variables needed in this program
	static String user_name;

	public static void main(String[] args) {
		// Ask the user their name and store it in user_name
		System.out.println("Hello, may I ask your name? ");
		user_name = scanner.nextLine();

		// Echo their name and get the days jogged from the user
		// and store it in the days_jogged variable
		System.out.println("Thank you " + user_name + ". I hope you are having a good day.");
		System.out.println("Please tell me the number of days you have jogged this week?");
		String input = scanner.nextLine();
		days_jogged = Integer.parseInt(input);
		// Conditions to handle invalid entry
		if (days_jogged < 0) {
			System.out.println("Invalid entry");
		} else if (days_jogged > 7) {
			System.out.println("Invalid: The maximum number of days in a week is 7");
		}
		System.out.println("That's great! " + days_jogged + " is great!");

		// Ask the user how many hours they jogged and store it in hours_jogged
		System.out.println("How many hours did you jog on these " + days_jogged + " days?");
		String input1 = scanner.nextLine();
		hours_jogged = Integer.parseInt(input1);
		if (hours_jogged > 1) {
			System.out.println(
					"Awesome, you jogged " + hours_jogged + " hours on each of these " + days_jogged + " days.");
		} else if (hours_jogged == 1) {
			System.out.println(
					"Awesome, you jogged " + hours_jogged + " hour on each of these " + days_jogged + " days.");
		}

		// Calculate the number of hours the user has jogged
		int total_hours_jogged = (days_jogged * hours_jogged);
		System.out.println("In the last " + days_jogged + " days you have jogged " + total_hours_jogged + " hours!");
		if (total_hours_jogged <= 15) {
			System.out.println(total_hours_jogged + " hours jogged means you are an amatuer jogger.");
		} else if (total_hours_jogged <= 40) {
			System.out.println(total_hours_jogged + " hours jogged means you are an efficient jogger.");
		} else if (total_hours_jogged > 41) {
			System.out.println(total_hours_jogged + " hours jogged means you are an extremest!");
		}

		exitApplication();
	}

	private static void exitApplication() {
		System.out.println("Well, have a good day " + user_name + " and keep it up!");
	}
}