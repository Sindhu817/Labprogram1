package Labprogram;
import java.util.Scanner;

public class PalindromeProgram {

	public static void main(String[] args) {
		//intilzing variables
		int num,rev=0;
		//Creating object for scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		int a=num;
		//logic for palindrome number
		while(num>0)
		{
			rev = rev*10+num%10;
			num=num/10;	
		}
		/*-----------------checking given number is palindrome or not-----------------*/
		if(a==rev)
		{
			System.out.println("Entered  number is palindrome"+a);
		}
		else
		{
			System.out.println("Entered  number is not palindrome"+a);
		}
	}

}
