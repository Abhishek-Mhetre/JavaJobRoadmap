package Day01;
import java.util.Scanner;
public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        
        if(a>0) {
        	System.out.println("Positive Number =" +a);
        }else if (a<0) {
			System.out.println("Negative Number =" +a);
		}else {
			System.out.println("Zero");
		}
        
	}

}
