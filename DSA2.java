package Day01;

import java.util.Iterator;

public class DSA2 {
                                               // DSA 2 Find the smallest number.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int numbers[] = {10,25,7,90,45};
        int smallestN = numbers[0];
        
        for(int i = 1; i < numbers.length; i++) {
        	 if (numbers[i] < smallestN) {
				smallestN = numbers[i];
			}
        }
        
        System.out.println("Smallest Number = " +smallestN);
	}

}
