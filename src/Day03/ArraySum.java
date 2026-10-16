package Day03;
import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner scanner = new Scanner(System.in);
           
            
            System.out.println("Enter 5 numbers");
            int num[] = new int[5];
            int sum = 0;
            
            
            for(int i = 0; i < num.length; i++) {
            	num[i] = scanner.nextInt();
            	sum = sum + num[i];
            }
            System.out.println("Sum = " +sum);
	}

}
