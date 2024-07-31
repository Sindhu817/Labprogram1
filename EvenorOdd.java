package MethodExample;
public class EvenorOdd {
   /* ---checking given number is odd or even--- */
	public static void checkevenodd(int a) {
		if(a%2==0)
		{
			System.out.println(a+" is even number");
		}
		else
		{
			System.out.println(a+" is odd number");
		}
	}
		public static void main(String[] args) {
			/*calling the method*/
			checkevenodd(6);
			checkevenodd(7);
		}
}
