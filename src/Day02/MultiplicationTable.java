package Day02;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scanner = new Scanner(System.in);
          
          System.out.println("Enter Number : ");
          
          int n = scanner.nextInt();
          
          for(int i = 1; i <= 10; i++) {
        	  System.out.println(+ n +"x" + i + "=" +(n*i));
          }
          
	}

}
