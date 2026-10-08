package Day02;

public class DSA1 {
                                              // find largest number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int numbers[] = {10,25,7,90,45};
          int largestN = numbers[0];
          
          for(int i = 1; i < numbers.length; i++) {
        	  if(numbers[i] > largestN) {
        		  largestN = numbers[i];
        	  }
          }
          System.out.println(largestN);
          
	}

}
