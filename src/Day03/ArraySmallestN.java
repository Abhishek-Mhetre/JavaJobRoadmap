package Day03;

public class ArraySmallestN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int nums[] = {7,25,7,90,25};
        int smallestN = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
        	if(nums[i] < smallestN) {
        		smallestN = nums[i];
        	}
        }
        System.out.println(smallestN);
	}

}
