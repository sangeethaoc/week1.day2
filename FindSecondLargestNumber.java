package week1.day2;

import java.util.Arrays;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		
				int[] data = {3,2,11,4,6,7};
				
				int secLargestIndex;
				
				Arrays.sort(data);
				
				secLargestIndex = data.length -2;
				
				System.out.println("Second Largest Number from the given array is : "+data[secLargestIndex]);
				
	}

}
