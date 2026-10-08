package Day02;
import java.util.Scanner;
public class CountgDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter Numbers");
          int n = scanner.nextInt();
          int count = 0;
          
           while(n != 0) {
        	   n = n / 10;
        	   count++;
        	   
           }
          
          System.out.println(count);
          
	}

}
