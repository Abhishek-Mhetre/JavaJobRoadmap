package Day03;

public class DSA02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // Find Smallest Number;
		 
		int nums[] = {10,25,7,90,45};
		int smallest = nums[0];
		  
		for(int i = 1; i < nums.length; i++) {
			if (nums[i] > smallest) {
				smallest = nums[i];
				
			}
			
		}
		System.out.println(smallest);
	} 

}
