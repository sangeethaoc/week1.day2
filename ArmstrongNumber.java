package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input = 153;
		int original = input,rem,sum =0;
		//output: (1*1*1)+(5*5*5)+(3*3*3) = 153
		while(input>0)
		{
			rem = input%10;
			sum = sum+(rem*rem*rem);
			input = input/10;
		}
		if(original == sum)
		System.out.println("The given number " +original +" is an Armstrong Number");
	}

}
