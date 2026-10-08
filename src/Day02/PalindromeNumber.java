package Day02;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int original = number;
        int reverse = 0;

        while (number != 0) {

            int digit = number % 10;

            reverse = reverse * 10 + digit;

            number = number / 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

	}

}
