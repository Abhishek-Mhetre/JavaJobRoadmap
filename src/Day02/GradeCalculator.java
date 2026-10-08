package Day02;
import java.util.Scanner;
public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scanner = new  Scanner(System.in);
           System.out.println("Enter Marks : ");
           int n = scanner.nextInt();
           
           if(n >= 90) {
        	   System.out.println("A+");
           }else if (n >= 80) {
        	   System.out.println("A");
        	   
			}else if (n >= 70) {
				System.out.println("B");
				
			}else if (n >= 50) {
				System.out.println("C");
				
			}else {
				System.out.println("Fail");
				
			}
           
	}

}
