package problems;

public class TwoSumOfSortedArray167 {
	    public static int[] twoSum(int[] numbers, int target) {
	        int p1=0;
	        int p2=numbers.length-1;
	     while(p1<p2){
	        if(numbers[p1]+numbers[p2]<target){
	            p1++;
	        }else if(numbers[p1]+numbers[p2]>target){
	            p2--;
	        }else{
	        	System.out.println(p1+1);
	        	System.out.println(p2+1);
	            return new int[]{p1+1,p2+1};
	        }
	     }
	     return new int[]{};
	    }
	    public static void main(String[] args) {
	    	System.out.println(twoSum(new int[] {2,7,11,15},9));
	    }
}
