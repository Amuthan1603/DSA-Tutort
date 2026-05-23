package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysII350 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = new int[] {1,2,2,1};
		int[] nums2 = new int[] {2,2};
		intersect(nums1, nums2);
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> set=new HashMap<>();
        for(int n:nums1){
            set.put(n,set.getOrDefault(n,0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for(int n:nums2){
            if(set.containsKey(n) && set.get(n)>0){
                list.add(n);
                set.put(n,set.get(n)-1);
            }
        }
        int[] result=new int[list.size()];
        for(int j=0;j<list.size();j++){
            result[j]=list.get(j);
            System.out.println(result[j]);
        }
        return result;
    }
}
