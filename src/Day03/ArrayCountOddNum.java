package Day03;

public class ArrayCountOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int nums[] = {10,25,7,90,45};
          int count = 0;
          
          for(int i = 0; i < nums.length; i++) {
        	  if(nums[i] % 2 == 1) {
        		  count++;
        	  }
          }
          System.out.println(count);
	}

}
