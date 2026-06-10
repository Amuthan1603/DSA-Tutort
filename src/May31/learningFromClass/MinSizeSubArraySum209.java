package learningFromClass;

public class MinSizeSubArraySum209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minSubArrayLen(7, new int[] {2,3,1,2,4,3}));
	}
	
	 public static int minSubArrayLen(int target, int[] nums) {
	        int start=0;
	        int cSum=0;
	        int minLen=Integer.MAX_VALUE;
	        for(int end=0;end<nums.length;end++){
	            cSum+=nums[end];
	            while(cSum>=target){
	                cSum-=nums[start];
	                minLen=Math.min(minLen,end-start+1);
	                start++;
	            }
	        }
	        return minLen==Integer.MAX_VALUE?0:minLen;
	    }

}
