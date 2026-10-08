package Day02;
import java.util.Scanner;
public class PositiveAndNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scanner = new Scanner(System.in);
           System.out.println("Enter Number");
           int n = scanner.nextInt();
           
           if(n > 0) {
        	   System.out.println("Positive");
           }else if (n < 0) {
        	   System.out.println("Negative");
			
		}else {
			System.out.println("Zero");
		}
           
	}

}
