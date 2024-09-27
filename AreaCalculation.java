package MethodOverloading;

import java.util.Scanner;

// Class to calculate the area of different shapes
class AreaCalculator {
	// Method to calculate the area of a circle
	public static void area(float radius) {
		// Area formula: π * r^2
		float area = 3.14f * radius * radius;
		System.out.println("------------ Circle ------------");
		System.out.println("Radius = " + radius + " cm");
		System.out.println("Area = " + area + " cm²");
	}

	// Method to calculate the area of a square
	public static void area(int side) {
		// Area formula: side * side
		int area = side * side;
		System.out.println("------------ Square ------------");
		System.out.println("Side = " + side + " cm");
		System.out.println("Area = " + area + " cm²");
	}

	// Method to calculate the area of a rectangle
	public static void area(int length, int width) {
		// Area formula: length * width
		float area = length * width;
		System.out.println("------------ Rectangle ------------");
		System.out.println("Length = " + length + " cm");
		System.out.println("Width = " + width + " cm");
		System.out.println("Area = " + area + " cm²");
	}
}

// Main class to run the area calculation program
public class AreaCalculation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
		//AreaCalculator calculator = new AreaCalculator(); // Create an instance of AreaCalculator

		// Infinite loop to continuously prompt the user until they choose to exit
		while (true) {
			System.out.println("Select the shape to calculate the area:");
			System.out.println("1. Circle");
			System.out.println("2. Square");
			System.out.println("3. Rectangle");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt(); // Read the user's choice

			// Switch statement to handle user choices
			switch (choice) {
			case 1: // Circle case
				System.out.print("Enter the radius of the circle: ");
				float radius = scanner.nextFloat(); // Read the radius
				AreaCalculator. // Call the area method for circle
				break;

			case 2: // Square case
				System.out.print("Enter the side of the square: ");
				int side = scanner.nextInt(); // Read side through keyboard 
				calculator.area(side); // Call the area method for square
				break;

			case 3: // Rectangle case
				System.out.print("Enter the length of the rectangle: ");
				int length = scanner.nextInt(); // Read the length
				System.out.print("Enter the width of the rectangle: ");
				int width = scanner.nextInt(); // Read the width
				calculator.area(length, width); // Call the area method for rectangle
				break;

			case 4: // Exit case
				System.out.println("Exiting the program."); // Notify user of exit
				scanner.close(); // Close the scanner resource
				return; // Exit the program

			default: // Invalid choice handling
				System.out.println("Invalid choice. Please try again."); // Prompt for valid choice
			}
	
		}
		
	}
}
