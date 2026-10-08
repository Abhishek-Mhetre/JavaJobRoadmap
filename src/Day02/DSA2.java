package Day02;

public class DSA2 {
                                                 // find Smallest number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int numbers[] = {10,25,7,90,45};
           int smallest = numbers[0];
           
           for(int i = 1; i < numbers.length; i++) {
        	   if(numbers[i] < smallest) {
        		   smallest = numbers[i];
        	   }
           }
           System.out.println(smallest);
	}

}
