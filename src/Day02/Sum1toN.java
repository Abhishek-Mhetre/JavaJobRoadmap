package Day02;
import java.util.Scanner;
public class Sum1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = scanner.nextInt();
        int s = 0;
        for(int i = 0; i <= n; i++) {
        	s = s + i;
        }
        
        System.out.println(s);
        
	}

}
