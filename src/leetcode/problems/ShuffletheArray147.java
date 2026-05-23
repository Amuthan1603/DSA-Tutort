package problems;

public class ShuffletheArray147 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] d=shuffle(new int[] {2,5,1,3,4,7},3);
			 for(int i=0;i<d.length;i++)
		        {
		            System.out.println(d[i]);
		        }
	}
	
	 public static int[] shuffle(int[] nums, int n) {
		 int i=0;
	        int[] li=new int[n+n];
	        int j=0;
	        while(i<2*n && j<n){
	            li[i]=nums[j];
	            li[i+1]=nums[j+n];
	            i=i+2;
	            j++;
	        }
	        return li;
	 }

}
