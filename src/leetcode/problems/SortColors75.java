package problems;

public class SortColors75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortColors(new int[] {2,0,2,1,1,0,1});
	}
	
	 public static void sortColors(int[] nums) {
	        int zeroP=0;
	        int oneP=0;
	        int twoP=nums.length-1;
	        while(oneP<=twoP){
	            switch(nums[oneP]){
	                case 0:
	                swap(nums,oneP,zeroP);
	                zeroP++;
	                oneP++;
	                break;
	                case 1:
	                oneP++;
	                break;
	                case 2:
	                swap(nums,oneP,twoP);
	                twoP--;
	            }
	        }
	        for(int n:nums) {
	        	System.out.println(n);
	        }
	    }
	 
	    public static void swap(int[] nums,int first,int second){
	        int temp=nums[first];
	        nums[first]=nums[second];
	        nums[second]=temp;
	    }

}
