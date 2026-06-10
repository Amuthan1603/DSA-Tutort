package problems;

public class PartitionArrayAccordingtoGivenPivot2161 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pivotArray(new int[]{9,12,5,10,14,3,10},10);
	}
	
    public static int[] pivotArray(int[] nums, int pivot) {
    	int[] r=new int[nums.length];
//    	first approach creating multiple array and result in 4ms
//        int[] sa=new int[nums.length];
//        int[] la=new int[nums.length];
//        int[] ea=new int[nums.length];
//        int i=0;int j=0; int k=0;
//        for(int n:nums){
//            if(n>pivot){
//                la[i]=n;
//                i++;
//            }else if(pivot>n){
//                sa[j]=n;
//                j++;
//            }else{
//                ea[k]=n;
//                k++;
//            }
//        }
//        int c=0;
//        for(int m=0;m<j;m++){
//            r[c]=sa[m];
//            System.out.println(r[c]);
//            c++;
//        }
//         for(int m=0;m<k;m++){
//            r[c]=ea[m];
//            System.out.println(r[c]);
//            c++;
//        }
//         for(int m=0;m<i;m++){
//            r[c]=la[m];
//            System.out.println(r[c]);
//            c++;
//        }
//    	second approach pointer result in 5ms
//    	int start=0;
//        int end=nums.length-1;
//         for(int i=0,j=nums.length-1;i<nums.length;i++,j--){
//            if(nums[i]<pivot){
//                r[start]=nums[i];
//                start++;
//            }
//            if(nums[j]>pivot){
//                r[end]=nums[j];
//                end--;
//            }
//        }
//        while(start<=end){
//            r[start]=pivot;
//            start++;
//        }
//    	another solution
    	int start=0;
        int end=nums.length-1;
        int s=0;
        int e=0;
         for(int i=0,j=nums.length-1;i<nums.length;i++,j--){
            if(nums[i]<pivot){
                s++;
            }
            if(nums[j]==pivot){
                e++;
            }
        }
         int l=s+e;
         int i=0;
       for(int n: nums) {
    	   if(n<pivot) {
    		   r[i++]=n;
    	   }else if(n==pivot) {
    		   r[s++]=pivot;
    		   
    	   }else {
    		   r[l++]=n;
    	   }
    	   
       }
       for(int k:r) {
    	   System.out.println(k);
       }
        return r;
    }

}
