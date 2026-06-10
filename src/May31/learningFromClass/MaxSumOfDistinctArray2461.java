package learningFromClass;

import java.util.HashMap;
import java.util.Map;

public class MaxSumOfDistinctArray2461 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maximumSubarraySum(new int[] {1,5,4,2,9,9,9}, 3));
	}
	
	 public static long maximumSubarraySum(int[] nums, int k) {
	        Map<Integer,Integer> map=new HashMap<>();
	        long mSum=0;
	        long sum=0;
	        int left=0;
	        for(int right=0;right<nums.length;right++){
	            sum+=nums[right];
	            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
	            if(right-left+1>k){
	                sum-=nums[left];
	                map.put(nums[left],map.get(nums[left])-1);
	            if(map.get(nums[left])==0){
	                map.remove(nums[left]);
	            }
	            left++;
	            }
	            if(right-left+1==k && k==map.size()){
	                mSum=Math.max(mSum,sum);
	            }
	        }
	        return mSum;
	    }

}
