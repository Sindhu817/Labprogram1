package AreaandPerimeter;

import java.util.Scanner;

public class AreaandPerimeter {
	/*----Method to calculate area of rectangle----*/

	public static float areaofrectangle(float length,float width) {
		float A;
		A=length*width;
		return A;	
	}
	/*----Method to calculate perimeter of rectangle----*/
	public static float perimeterofRectangle(float length,float width) {
		float P;
		P=2*(length+width);
		return P;
	}
	public static void main(String[]args) {
		//variables to store length and breadth
		float length,width;
		//creating object of scanner class
		Scanner sc = new Scanner(System.in);
		/*input from keyboard*/
		System.out.println("Enter length value : ");
		length = sc.nextInt();
		System.out.println("Enter width value : ");
		width=sc.nextInt();
		/*---calling the methods----*/
		float Area=areaofrectangle(length,width);
		float Perimeter=perimeterofRectangle(length,width);
		/*-----print area of the rectangle----*/
		System.out.println("The area of the rectangle :"+Area);
		/*-----print perimeter of the rectangle----*/
		System.out.println("The Perimetre of the rectangle :"+Perimeter);
		//verifying whether the length is positive or negative
		if(length<0)
		{
			System.err.println("unable to proceed with negative length");
			
		}
		else {
			//input of breadth through keyboard
			System.out.println("Enter breadth of rectangle");
			
		}
		
	}
	

}
