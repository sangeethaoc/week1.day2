package week1.day2;

public class LearnJumpStatements {
	public static void main(String[] args) {
		for(int i = 1;i<=10;i++)
		{
			if(i ==3)
			{
				System.out.println("Three");
				continue;
			}
			if(i ==6)
				break;
			System.out.println(i);
		}
			
	}

}
