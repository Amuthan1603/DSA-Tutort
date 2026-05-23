package problems;

public class BestTimeToBuyAndSellStock122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maxProfit(new int[] {7,1,5,3,6,4});
	}
	public static int maxProfit(int[] prices) {
        int s=prices[0];
        int p=0;
        int sum=0;
        for(int i=1;i<prices.length;i++){
            if(s>prices[i]){
                s=prices[i];
            }else if(p<prices[i]-s){
                p=prices[i]-s;
                s=prices[i];
                if(p>0){
                    sum=sum+p;
                    p=0;
                }
            }
        }
        System.out.println(sum);
        return sum;
    }

}
