
public class ProductOfArrayexceptSelf238 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		productExceptSelf(new int[] {1,2,3,4});
	}
	
	 public static int[] productExceptSelf(int[] nums) {
	        int[] left=new int[nums.length];
	        int[] right=new int[nums.length];
	         left[0]=nums[0];
	        for(int i=1;i<nums.length;i++){
	            left[i]=left[i-1]*nums[i];
	        }
	        // left[1,2,6,24]
	        right[nums.length-1]=nums[nums.length-1];
	        for(int i=nums.length-2;i>=0;i--){
	            right[i]=right[i+1]*nums[i];
	        }
	        // right[24,24,12,4]
	        for(int i=0;i<nums.length;i++){
	            if(i==0){
	                nums[i]=right[i+1];
	            }
	            else if (i==nums.length-1){
	                nums[i]=left[i-1];
	            }
	            else{
	                nums[i]=left[i-1]*right[i+1];
	            }
	            System.out.println(nums[i]);
	        }
	    return nums;
	    }

}
