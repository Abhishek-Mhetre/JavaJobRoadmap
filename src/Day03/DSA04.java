package Day03;

public class DSA04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find Average
		int nums[] = {10,25,7,90,45};
		int sum = 0;
		
		for(int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			
		}
		
		double avg = (double) sum / nums.length;
		
		System.out.println(avg);
			
	}

}
