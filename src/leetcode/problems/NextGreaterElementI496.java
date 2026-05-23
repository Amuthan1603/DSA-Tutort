package problems;

public class NextGreaterElementI496 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = new int [] {4,1,2};
		int[] nums2 = new int[] {1,3,4,2};
		nextGreaterElement(nums1, nums2);
	}
	
	 public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
	        int[] li=new int[nums1.length];
	        for(int i=0;i<nums1.length;i++){
	            for(int j=0;j<nums2.length;j++){
	                if(nums1[i]==nums2[j]){
	                    int c=0;
	                    j++;
	                    while(j<nums2.length){
	                        if(nums1[i]<nums2[j]){
	                             c=1;
	                        li[i]=nums2[j];
	                        System.out.println(li[i]);
	                        break;
	                        }
	                        j++;
	                    }
	                    if(c==0){
	                        li[i]=-1;
	                        System.out.println(li[i]);
	                    }
	                }
	            }
	        }
	        return li;
	    }

}
