package myprogram;
//import Scanner class for user input
import java.util.Scanner;
//Class declaration
public class ReverseNumber 
{
	//Main method where the program excution begins
	public static void main(String[] args)
	{
		//Intialize variable to store the reversed number
		int a=0;
		//Variable to store the remainder of division
		int r;
		// Create Scanner object to read input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for getting a reverse number");
		// Read the integer input from the user
		int n=sc.nextInt();
		System.out.println("The entered number is : "+n);
		  // While loop to process each digit of the input number
		while(n!=0)
		{
			// Get the last digit of the number
			r=n%10;
			 System.out.println("Extracted digit: " + r);
			// Build the reversed number
			a=a*10+r;
			 System.out.println("Current reversed number: " + a);
			 // Remove the last digit from the number
			n=n/10;
			 System.out.println("Remaining number: " + n);
		}
			System.out.println("The revrse number  is : " +a);	
	}
}






















