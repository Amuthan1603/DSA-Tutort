package problems;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(generate(5));
	}
	
	 public static List<List<Integer>> generate(int numRows) {
	        int[] arr=new int[numRows];
	        arr[0]=1;
	        List<List<Integer>> result= new ArrayList<>();
	        for(int i=0;i<numRows;i++)
	        {
	            List<Integer> innerList= new ArrayList<>();
	            for(int j=i;j>0;j--){
	                arr[j]=arr[j]+arr[j-1];
	               
	            }
	            for(int j=0;j<=i;j++){
	            	 innerList.add(arr[j]);
		            System.out.println(arr[j]+" ");
		        }
	            result.add(innerList);
	        }
	        
	       
	        return result;
	    }
}
