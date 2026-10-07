package Day01;
import java.util.Scanner;
public class P7 {

	public static void main(String[] args) {      
		// TODO Auto-generated method stub
         Scanner scanner = new Scanner(System.in);
         
         int a = scanner.nextInt();
         int b = scanner.nextInt();
         int c = scanner.nextInt();
         
         if (a >= b && a >= c) {                              //Find the largest of three numbers.
        	 System.out.println("Largest Number =" +a);
			
		}else if (b >= a && b >= c) {
			System.out.println("Largest Number =" +b);
			
		}else {
			System.out.println("Largest =" +c);
		}
	}

}
