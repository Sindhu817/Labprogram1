package Labprogram;

public class Pattern {

	public static void main(String[] args) {
		//intializing the number
		int num=54321;
		//take rev intially as 0
		int rev=0;
		int a;
		System.out.println("The given number is "+num);
		System.out.println("-------------------------------------------");
		System.out.println("Our required pattern is  " );
		//condition for pattern
		while(num>0) {
			a=num%10;
			rev=rev*10+a;
			//printing our required patten
			System.out.println(+rev);
			num=num/10;
		}
	}

}
