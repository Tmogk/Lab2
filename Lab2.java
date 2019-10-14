import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		double length;
		double width;
		char userChar;
		double area;
		double perimeter;

		userChar = 'y';

		while (userChar == 'y') {

			System.out.println("Welcome to the Grand Circus Room Detail Generator!");

			// Ask user for the length of the room as a double
			System.out.println("Enter the length of the room: ");
			length = scnr.nextDouble();

			// Ask user for the width of the room as a double
			System.out.println("Enter the width of the room: ");
			width = scnr.nextDouble();

			// Compute the area and perimeter of the room
			area = (length * width);
			perimeter = (length + length + width + width);

			// Print results
			System.out.println("Area is: " + area);
			System.out.println("Perimeter is: " + perimeter);

			// Ask user if they'd like to measure another room
			System.out.println("Do you want to measure another room?  If yes, press 'y'");
			userChar = scnr.next().charAt(0);
		}
		System.out.println("Done");
		scnr.close();
	}
}