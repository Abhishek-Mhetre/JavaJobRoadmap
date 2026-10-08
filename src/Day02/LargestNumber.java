package Day02;
import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scanner = new Scanner(System.in);
          System.out.println("enter number");
          int a = scanner.nextInt();
          System.out.println("enter number");
          int b = scanner.nextInt();
          System.out.println("enter number");
          int c = scanner.nextInt();
          
          if(a >= b && a >= c) {
        	  System.out.println("Largest = " +a);
          }else if (b >= a && b >= c) {
        	  System.out.println("Largest = " +b);
			
		}else {
			System.out.println("Largest = " +c);
		}
	}

}
