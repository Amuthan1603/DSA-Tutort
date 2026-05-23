package problems;

public class PlusOne66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] d=plusOne(new int[] {1,4,9});
		 for(int i=0;i<d.length;i++)
	        {
	            System.out.println(d[i]);
	        }
	}
	public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
        if(digits[i]<9){
            int m=digits[i];
            digits[i]=m+1;
            return digits;
        }
        digits[i]=0;
        }
        int[] dig=new int[digits.length+1];
        dig[0]=1;
       
        return dig;
    }
}
