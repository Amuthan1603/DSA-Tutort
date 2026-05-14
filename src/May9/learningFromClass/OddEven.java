package learningFromClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] l=new int[] {30,40,50};
		List<Integer> list=new ArrayList<>();
		list.add(30);
		list.add(13);
		list.add(40);
		list.add(20);
		list.add(17);
		int odd=0;
		int even=0;
		for(Integer i:list) {
			if(i%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Number of even "+even);
		System.out.println("No of odd "+odd);
	}

}
