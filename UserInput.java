package Day01;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter your name:");
         String name = scanner.nextLine();
         System.out.println("enter your age:");
         int age = scanner.nextInt();
         
         System.out.println("Name : "  +name);
         System.out.println("Age : " +age);
	}

}
