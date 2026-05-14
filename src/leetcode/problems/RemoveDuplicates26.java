package problems;

public class RemoveDuplicates26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
	}
	
	public static int removeDuplicates(int[] nums) {
		int p1=1;
        int c=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[p1]=nums[i+1];
                System.out.println(nums[p1]);
                p1++;
            }
        }
        return p1;
    }

}
