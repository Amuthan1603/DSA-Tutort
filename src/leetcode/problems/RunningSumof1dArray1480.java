package problems;

public class RunningSumof1dArray1480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] d=runningSum(new int[] {1,4,9});
		 for(int i=0;i<d.length;i++)
	        {
	            System.out.println(d[i]);
	        }
	}
	
	public static int[] runningSum(int[] nums) {
        int i=0;
        int sum=0;
        while(i<nums.length){
            sum=sum+nums[i];
            nums[i]=sum;
            i++;
        }
        return nums;
    }

}
