package Day03;

public class DSA01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // Find Largest
		
		int nums[] = {10,25,7,90,45};
		int large = nums[0];
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] > large) {
				large = nums[i];
			}
		}
		System.out.println(large);
	}

}
