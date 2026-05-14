package assignments;

public class MininmumOfThree {

	public static void main(String[] args) {
		int[] li=new int[]{1,2,8,10,6,7,4,20,9,9};
		int fMin=Integer.MAX_VALUE;
		int sMin=Integer.MAX_VALUE;
		int tMin=Integer.MAX_VALUE;
		for(int i=0;i<li.length;i++) {
			if(li[i]<fMin&&li[i]<sMin&&li[i]<tMin) {
				tMin=sMin;
				sMin=fMin;
				fMin=li[i];
			}else if(li[i]<sMin&&li[i]<tMin) {
				tMin=sMin;
				sMin=li[i];
			}else if (li[i]<tMin){
				tMin=li[i];
			}
			
		}
		System.out.println(fMin);
		System.out.println(sMin);
		System.out.println(tMin);
	}
}
