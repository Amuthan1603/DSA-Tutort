package problems;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		summaryRanges(new int[] {0,2,3,4,6,8,9});
	}
	
	public static List<String> summaryRanges(int[] nums) {
        List<String> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int s=nums[i];
            while(i+1<nums.length && nums[i]+1==nums[i+1]){
                i++;
            }
           if(s!=nums[i]){
            li.add(s+"->"+nums[i]);
            System.out.println(s+"->"+nums[i]);
           }else{
        	   System.out.println(s);
            li.add(String.valueOf(s));
           }
        }
        return li;
    }

}
