package Sum;
import java.util.Scanner;
public class Sumoftwonumbers {
	/*-----method to calculate sum----*/
		public static int calculatesum(int a, int b) {
			int c;
			c = a+b;
			return c;
		}
		public static void main(String []args) {
			int a,b;
			//Crating object for Scanner class
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter value for a");
			//taking input through the keyboard
			a=sc.nextInt();
			System.out.println("Enter value for b");
			b=sc.nextInt();
			int sum = calculatesum(a,b);
			System.out.println("The sum of" +a+ "and" +b+ "is " +sum);
			/*checking the sum is positive or negative*/
			if(sum>0)
			{
				System.out.println("It is positive number");
			}
			else
			{
				System.out.println("It is negative number");
			}
			
		}

	

}
