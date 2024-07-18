package SimpleInterest;

public class Calculator {

	public static void main(String[] args) {
		int principal=10000;
		float rate=3.5f;
		int time=2;
		double simpleIntrest= (principal * rate * time)/100;
		System.out.println("SimpleIntrest:"+simpleIntrest);
		

	}

}