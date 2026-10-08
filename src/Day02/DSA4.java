package Day02;

public class DSA4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int numbers[] = {10,25,7,90,45};
            int count = 0;
            
            for(int i = 0; i < numbers.length; i++) {
            	if(numbers[i] % 2 == 0) {
            		count++;
            	}
            }
            
            System.out.println(count);
	}

}
