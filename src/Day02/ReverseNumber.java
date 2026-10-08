package Day02;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = scanner.nextInt();
        int rev=0;
        
        while(n !=0) {
        	int digit = n % 10;
        	rev = rev * 10 + digit;
        	n = n / 10;
        	
        }
        System.out.println(rev);
	}

}
