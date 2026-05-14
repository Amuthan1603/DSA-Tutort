package problems;

public class ContainerWithMostWater11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
	}
	 public static int maxArea(int[] height) {
		 int len=height.length;
	        int low=0;
	        int high=len-1;
	        int max=0;
	        while(low<high){
	            int h=Math.min(height[low],height[high]);
	            int w=high-low;
	            max=Math.max(max,h*w);
	            if(height[low]<height[high]){
	                low++;
	            }else
	                high--;
	            }
	        return max;

    }
}
