package problems;

public class MoveZeros283 {

	public static void main(String[] args) {
		moveZeroes(new int []{0,1,0,3,12});
	}
	   public static void moveZeroes(int[] nums) {
	        int p2=0;
	        for(int i:nums){
	            if(i>0){
	                nums[p2]=i;
	                p2++;
	            }
	        }
	        for(int i=p2;i<nums.length;i++)
	        {
	            nums[i]=0;
	        }
	        for(int i=0;i<nums.length;i++)
	        {
	            System.out.println(nums[i]);
	        }
	    }
}
