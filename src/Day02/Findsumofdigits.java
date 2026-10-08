package Day02;
import java.util.Scanner;
public class Findsumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter Number");
       int n = scanner.nextInt();
       int sum=0;
       for(int i = n; i !=0; i = i / 10) {
    	    int digit = i % 10;
    	    sum = sum + digit;
       }
      System.out.println(sum);  
	}

}
