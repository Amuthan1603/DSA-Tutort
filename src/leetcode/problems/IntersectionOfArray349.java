package problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfArray349 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = new int[] {1,2,2,1};
		int[] nums2 = new int[] {2,2};
		intersection(nums1, nums2);
	}

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums1){
            set.add(n);
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[] result=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
            System.out.println(list.get(i));
        }
        
        return result;
    }
}
