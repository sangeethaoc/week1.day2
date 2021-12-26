package week1.day2;

public class Calculator {

	public static void main(String[] args) {
		
		int sum, quotient;
		double diff, prod;
		
		Calculator cal = new Calculator();
		sum = cal.add(10,20);
		diff = cal.sub(20.0,10.0);
		prod = cal.mul(10.0,20.0);
		quotient = cal.div(20,10);
		
		System.out.println("Addition : "+ sum);
		System.out.println("Subtraction : "+ diff);
		System.out.println("Multiplication : "+ prod);
		System.out.println("Division : "+quotient);
	}

	public int add(int a, int b) {
		return 	a+b;
	}
	
	public double sub(double a, double b) {
		return 	a-b;
	}
	
	public double mul(double a, double b) {
		return 	a*b;
	}
	
	public int div(int a, int b) {
		return 	a/b;
	}

}
