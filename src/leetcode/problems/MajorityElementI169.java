package problems;

public class MajorityElementI169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		majorityElement(new int[] {2,2,1,1,1,2,1});
	}
	public static int majorityElement(int[] nums) {
        int c=0;
        int d=0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                d=nums[i];
            }
            if(d==nums[i]){
                c++;
            }else {
            	c--;
            }
        }
        System.out.println(d);
        return d;
    }
}
