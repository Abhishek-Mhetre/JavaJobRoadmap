package Day01;

import java.util.Iterator;

public class DSA1 {
                                                // Find the largest number.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {10,25,7,90,45};
		int largest = numbers[0];
		for(int i = 1; i < numbers.length;i++) {
			if(numbers[i] > largest) {
				largest = numbers[i];
				
			}
		}
		
		System.out.println("Largest Number = " +largest);
		
	}

}
