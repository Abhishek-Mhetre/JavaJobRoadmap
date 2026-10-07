package Day01;

 

	import java.util.Scanner;

	public class P8 {

	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        double marks = scanner.nextDouble();
	        double total = scanner.nextDouble();

	        double percentage = (marks / total) * 100;           //Calculate student's percentage.

	        System.out.println("Percentage: " + percentage + "%");

	        scanner.close();
	    }
	}

