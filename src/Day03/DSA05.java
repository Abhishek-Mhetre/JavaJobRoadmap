package Day03;

public class DSA05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Count Numbers greater than 30
		int nums[] = {10,25,7,90,45};
		int count = 0;
		
	   for(int i = 1; i < nums.length; i++) {
		   if(nums[i] > 30) {
			  count++; 
		   }
	   }
	   System.out.println(count);
		
	}

}
