 package Day01;

import java.util.Scanner;

public class P10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        char operator = scanner.next().charAt(0);
        double b = scanner.nextDouble();

        switch (operator) {                // Create a simple calculator:
            case '+':
                System.out.println("Result: " + (a + b));
                break;

            case '-':
                System.out.println("Result: " + (a - b));
                break;

            case '*':
                System.out.println("Result: " + (a * b));
                break;

            case '/':
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid operator");
        }

        scanner.close();
    }
}
