package Labprogram;
import java.util.Scanner;

public class Greatest3 {

	public static void main(String[] args) {
		//intializing variables
		int num1;
		int num2;
		int num3;
		//Creating object for Scanner class
		Scanner sc=new Scanner(System.in);
		//enter values through the keybord 
		System.out.println("Enter first number");
		num1=sc.nextInt();
		System.out.println("Enter second number");
		num2=sc.nextInt();
		System.out.println("Enter third number");
		num3=sc.nextInt();
		/*finding largest number among the 3 numbers*/
		if(num1>num2)
		{
			if(num1>num3) {
				System.out.println(+num1+"is greater");
			}
			else {
				System.out.println(+num2+"is greater");
			}
		}
		else if(num2>num3)
		{
			System.out.println(+num2+"is greater");
		}
		else
		{
			System.out.println(+num3+"is greater");
		}
	}

}
