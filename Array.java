package week1.day2;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] nums = {60,20,80,40,50};
		int[] a = new int[10];
		Arrays.sort(nums);
		for(int i=0; i<10; i++)
		{
			a[i] = i+1;
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.println("length : "+nums.length);		
	}

}
