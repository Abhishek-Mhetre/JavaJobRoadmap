package Day01;
 import  java.util.Scanner;
public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
        
		/*int a =  11;
		
		if(a % 2 == 0) {
			System.out.println("Even =" +a);
		}else {
			System.out.println("Odd =" +a);
		}*/
		
		 Scanner scanner = new Scanner(System.in);

	        int a = scanner.nextInt();

	        if (a % 2 == 0) {
	            System.out.println("Even " + a);
	        } else {
	            System.out.println("Odd " + a);
	        }

	        scanner.close();
		
	}

}
