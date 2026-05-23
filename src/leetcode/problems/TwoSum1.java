package problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			twoSum(new int[] {3,2,4},6);
	}

	public static int[] twoSum(int[] nums, int target) {
        int[] li=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        int t=target-nums[i];
        if(map.containsKey(t)){
            li[0]=i;
            li[1]=map.get(t);
            System.out.println(i);
            System.out.println(map.get(t));
            break;
        }
        map.put(nums[i],i);
      }  
      return li;
    }
}
