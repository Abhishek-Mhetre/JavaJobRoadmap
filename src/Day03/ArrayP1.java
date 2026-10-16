package Day03;
import java.util.Scanner;
public class ArrayP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        int[] numbers = new int[5];

	        System.out.println("Enter 5 numbers:");

	        for (int i = 0; i < numbers.length; i++) {
	            numbers[i] = sc.nextInt();
	        }

	        System.out.println("Array elements:");

	        for (int i = 0; i < numbers.length; i++) {
	            System.out.println(numbers[i]);
	        }
	}

}
