package learningFromClass;

public class TrappingRainWater42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
	}

	 public static int trap(int[] height) {
	        int left=0;
	        int right=height.length-1;
	        int leftMax=0;
	        int rightMax=0;
	        int r=0;
	        while(left<right){
	            if(height[left]<=height[right]){
	                if(leftMax>height[left]){
	                    r=r+leftMax-height[left];
	                    left++;
	                }else{
	                    leftMax=height[left];
	                    left++;
	                }
	            }else{
	                if(rightMax>height[right]){
	                    r=r+rightMax-height[right];
	                    right--;
	                }else{
	                    rightMax=height[right];
	                    right--;
	                }
	            }
	        }
	        return r;
	    }
}
