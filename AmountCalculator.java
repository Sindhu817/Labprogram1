package SimpleInterest;
import java.util.Scanner;
public class AmountCalculator {
    /*----method to calculate simple intrest-----*/
	public static float calculateSimpleInterst(float principal,float rate,int time) 
	{
		float si;
		/*----calculating simple interest------*/
		si=(principal*rate*time)/100;
		/*----running simple interest-----*/
		return si;
	}
	public static void main(String[] args) {
		/*----Creating object of Scanner class---*/
		Scanner sc = new Scanner(System.in);
		//variables to store principal,rate and time
		float principal,rate;
		int time;
		/*---Input from keyboard----*/
		System.out.println("Enter principal(in Rs): ");
		principal = sc.nextInt();
		System.out.println("Enter rate(in %): ");
		rate = sc.nextInt();
		System.out.println("Enter time(in year): ");
		time = sc.nextInt();
		/*to calculate simple intrest and also calling method*/
		float interst = calculateSimpleInterst(principal,rate,time);
		/*----------to calculate amount-------------*/
		float amount = principal+interst;
		System.out.println("--------------------------------------------------------");
		System.out.println("Amount to be paid after changing simple interst "+amount);
	}
}
