package Labprogram;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// Creating object
		Scanner cal = new Scanner(System.in);
		/*creating two variables to store two numbers*/
		int num1,num2;
		int choice;//variable to declare wheather operations to continue or not
		/*------------------------------------------------------*/
		/*----------------input number through keyboard*-------*/
		do
		{
		System.out.println("Enter first number");
		num1=cal.nextInt();
		System.out.println("Enter second number");
		num2=cal.nextInt();
		/*displaying the menu of operations to the user*/
		System.out.println("------------------------------");
		System.out.println("--------NUMARICAL CALCULATIONS---------");
		System.out.println("1.Addition");	
		System.out.println("2.Difference");
		System.out.println("3.Product");
		System.out.println("4.Division");
		System.out.println("--------------------------------------");
		/*-----------------------------------------------------------*/
		/*--------------Asking the user to select any one operation------------*/
		System.out.println("Select any operation :");
		int operation=cal.nextInt();
		System.out.println("------------------------------------------");
		/*-------------performing the operation as per selection----------*/
		switch(operation)
		{
		case 1 : System.out.println("----------Addition operation---------");
		         System.out.println("Sum of"+num1+ "and"+num2+ "is"+(num1+num2));
		         break;
		case 2 : System.out.println("----------Difference operation---------");
		         System.out.println("Diference between"+num1+"and" +num2+ "is"+(num1-num2));
		         break;
		case 3 : System.out.println("----------Product operation---------");
		         System.out.println("Product of"+num1+ "and"+num2+"is :"+(num1*num2));
		         break;
		case 4 : System.out.println("----------Division operation--------");
		         System.out.println("division of " +num1+ "and"+num2+"is :"+(num1/num2));
		         System.out.println("On dividing"+num1+"by"+num2);
		         System.out.println("Remainder:"+(num1%num2));
		         break;
		default : System.out.println("Invalid operator");
		}
		System.out.println("--------------------------------------------------------------------");
		/*----------------Asking the user to continue or terminate-------------------------*/
		System.out.println("Press 0 to exit or anyother number to continue :");
		choice=cal.nextInt();
		System.out.println("--------------------------------------------------------------------------");	
		
	  }while(choice!=0);
	}

}
