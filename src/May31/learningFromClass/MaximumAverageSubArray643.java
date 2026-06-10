package learningFromClass;

public class MaximumAverageSubArray643 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4));
	}

	public static double findMaxAverage(int[] nums, int k) {
        // double sum=0;
        // double cAvg=0;
        // double mAvg=0;
        // int left=0;
        // Map<Integer,Integer>map=new HashMap<>();
        // for(int right=0;right<nums.length;right++){
        //     sum+=nums[right];
        //     map.put(nums[right],map.getOrDefault(nums[right],0)+1);
        //     if(right-left+1>k){
        //         map.put(nums[left],map.get(nums[left])-1);
        //         sum-=nums[left];
        //         if(map.get(nums[left])==0){
        //             map.remove(nums[left]);
        //         }
        //         left++;
        //     }
        //     if(right-left+1==k&&k==map.size()){
        //         cAvg=sum/k;
        //         mAvg=Math.max(cAvg,mAvg);
        //     }
        // }
        // return mAvg;
        int windowSum=0;
        for(int i=0;i<k;i++){
            windowSum+=nums[i];
        }
        int maxSum=windowSum;
        for(int i=k;i<nums.length;i++){
            windowSum+=nums[i];
            windowSum-=nums[i-k];
            maxSum=Math.max(maxSum,windowSum);
        }
        return (double) maxSum/k;
    }
}
