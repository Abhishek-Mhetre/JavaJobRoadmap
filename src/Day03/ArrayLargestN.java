package Day03;

public class ArrayLargestN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num[] = {10,25,7,90,45};
       
       int largeN = num[0];
       
       for(int i = 1; i < num.length; i++) {
    	   if(num[i] > largeN) {
    		   largeN = num[i];
    		   
    	   }
    	   
       }
       System.out.println(largeN);
       
	}

}
