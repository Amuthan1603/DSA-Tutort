package problems;

public class BestTImetoBuyAndSellStock121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxProfit(new int [] {7,1,5,3,6,4}));
	}

	 public static int maxProfit(int[] prices) {
		 int s=prices[0];
	        int l=0;
	        for(int i=1;i<prices.length;i++){
	            if(s>prices[i]){
	                s=prices[i];
	            }else if(l<prices[i]-s){
	                l=prices[i]-s;
	            }
	        }
	        return l;
	    }
}
