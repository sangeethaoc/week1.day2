package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		int input=246;
		int sum = 0;
		int mod = 0;
		while(input > 0)
		{
			mod = input%10;
			sum=sum+mod;
			input=input/10;
		}
		System.out.println("Sum of Digits of :" +sum);
	}

}
