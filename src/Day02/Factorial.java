package Day02;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter Number : ");
          
          int n = scanner.nextInt();
          int factorial = 1;
          
          for(int i = 1; i <=n; i++) {
        	  factorial = factorial * i;
          }
          
          System.out.println("Factorial : " +factorial);
	}

}
