package problems;

public class RemoveDuplicate27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeElement(new int[] {3,2,2,3},3));
	}
	public static int removeElement(int[] nums, int val) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[c]=nums[i];
                c++;
            }
        }
        return c;
    }

}
