package problems;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		majorityElement(new int[] {2,1,1,3,1,4,5,6});
	}
    public static List<Integer> majorityElement(int[] nums) {
        int cand1=0;
        int cand2=0;
        int c1=0;
        int c2=0;
        for(int n:nums){
           if(cand1==n){
               c1++;
           } else  if(cand2==n){
               c2++;
           } else if(c1==0){
               cand1=n;
               c1=1;
           }else if(c2==0){
               cand2=n;
               c2=1;
           }
           else{
               c2--;
               c1--;
           }
        }
           int co1=0;
           int co2=0;
           for(int n:nums){
               if(n==cand1){
                   co1++;
               }else if(n==cand2){
                   co2++;
               }
           }
           List<Integer> li=new ArrayList<>();
           if(co1>nums.length/3){
               li.add(cand1);
           }
           if(co2>nums.length/3){
               li.add(cand2);
           }
           for(Integer i:li) {
        	   System.out.println(i);
           }
           return li;
       }

}
