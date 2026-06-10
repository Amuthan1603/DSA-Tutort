package learningFromClass;

public class MaximumSubArray53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maxSubArray(new int[] {5,4,-1,7,8});
	}

	public static int maxSubArray(int[] nums) {
//	    int currentSum=nums[0];
//	    int maxSum=nums[0];
//	    for(int n=1;n<nums.length;n++){
//	        currentSum=Math.max(currentSum+nums[n],nums[n]);
//	        maxSum=Math.max(maxSum,currentSum);
//	        System.out.println(maxSum);
//	    }       
	    
	    int currentSum=0;
	    int maxSum=Integer.MIN_VALUE;
	    for(int n:nums){
	        currentSum+=n;
	        maxSum=Math.max(maxSum,currentSum);
	        if(currentSum<0){
	            currentSum=0;
	        }
	    }    
	    return maxSum;
	    }
}
