package problems;


public class HappyNumber202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHappy(2));
	}

	 public static boolean isHappy(int n) {
         int slow=n;
         int fast=n;
         do{
            slow=sqroot(slow);
            fast=sqroot(sqroot(fast));
         }
        while(slow!=1 && fast!=slow);
        return fast==1;
    }

    public static int sqroot(int n){
        int sum=0;
         while(n>0){
            int mod=n%10;
             n=n/10;
            sum=sum+mod*mod;
            
        }
        return sum;
    }
}
