import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threeSum(new int[] {-1,0,1,2,-1,-4});
	}
	public static List<List<Integer>> threeSum(int[] nums) {
	       
        Arrays.sort(nums);
        List<List<Integer>> li=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
             int p1=i+1;
            int p2=nums.length-1;
            int prev=nums[i];
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
        while(p1<p2){
            if(p2<nums.length-1&&nums[p2]==nums[p2+1]){
                p2--;
                continue;
            }
            if(nums[p1]+nums[p2]+prev>0){
                p2--;
            }else if (nums[p1]+nums[p2]+prev<0){
                p1++;
            }else if(nums[p1]+nums[p2]+prev==0){
                List<Integer> li1=new ArrayList<>();
                li1.add(nums[p1]);
                li1.add(nums[p2]);
                li1.add(prev);
                System.out.print(nums[p1]);
                System.out.print(nums[p2]);
                System.out.print(prev);
                li.add(li1);
                System.out.println("");
                p1++;
                p2--;
            }
            
        }
        }
        return li;
    }

}
