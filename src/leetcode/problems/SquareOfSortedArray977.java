package problems;

import java.util.Arrays;

public class SquareOfSortedArray977 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] result=sortedSquares(new int[]{-4,-1,0,3,10});
			Arrays.asList(result).stream().forEach(r->{
				System.out.println("result"+r);
			});
			for(int i=0;i<result.length;i++) {
				System.out.println(result[i]);
			}
	}

	
	   public static int[] sortedSquares(int[] nums) {
	        int[] result= new int[nums.length];
	        int left=0;
	        int right=nums.length-1;
	        int i=nums.length-1;
	        while(left<=right){
	            int leftsq=nums[left]*nums[left];
	            int rightSq=nums[right]*nums[right];
	            if(leftsq<rightSq){
	                result[i]=rightSq;
	                right--;
	            }else{
	            result[i]=leftsq;
	            left++;
	            }
	            i--;
	        }
	        return result;
	    }
}
