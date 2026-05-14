package learningFromClass;

public class FirstThreeMaxVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] li=new int[]{1,2,8,1,6,7,4,20,9,9};
		int fMax=0;
		int sMax=0;
		int tMax=0;
		for(int i:li) {
			if(i>fMax && i>sMax && i>tMax) {
				tMax=sMax;
				sMax=fMax;
				fMax=i;
			}else if(i<fMax && i>sMax && i>tMax) {
				tMax=sMax;
				sMax=i;
			}else if(i<fMax && i<sMax && i>tMax) {
				tMax=i;
			}
		}
		System.out.println(fMax);
		System.out.println(sMax);
		System.out.println(tMax);
	}

}
