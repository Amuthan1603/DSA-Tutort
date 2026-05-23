package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangleII119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getRow(3);
	}
	public static List<Integer> getRow(int rowIndex) {
        int[] arr=new int[rowIndex+1];
        List<Integer> li=new ArrayList<>(rowIndex+1);
        li.set(0, 1);
        arr[0]=1;
        for(int i=0;i<rowIndex+1;i++){
            for(int j=i;j>0;j--){
                arr[j]=arr[j]+arr[j-1];
                System.out.println(arr[j]+"out "+j);
            }
        }
        if(rowIndex==0){
            li.add(1);
        }else{
         for(int j=0;j<=rowIndex;j++){
        	 System.out.println(arr[j]);
                li.add(arr[j]);
            }
            }
       
        return li;
    }

}
