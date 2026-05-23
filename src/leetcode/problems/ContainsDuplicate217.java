package problems;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(containsDuplicate(new int[] {1,2,3,1}));
	}

	 public static boolean containsDuplicate(int[] nums) {
	        Set<Integer> ha=new HashSet<>();
	        for(int n:nums){
	            // .add() returns false if the element already exists in the set
	            if(!ha.add(n)){
	                return true;
	            }
	            ha.add(n);
	        }
	        return false;
	    }
}
