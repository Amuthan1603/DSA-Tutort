package problems;

import java.util.Arrays;

public class jewelAndStones777 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jewels = "aA";
		String stones = "aAAbbbb";
				System.out.println(myNumJewelsInStones(jewels, stones));
		System.out.println(numJewelsInStones(jewels, stones));
	}
	
	 public static int myNumJewelsInStones(String jewels, String stones) {
	        char[] stonesChar=stones.toCharArray();
	        int count=0;
	        for(int i=0;i<stonesChar.length;i++) {
	        	if(jewels.contains(String.valueOf(stonesChar[i]))) {
	        		count++;
	        	}
	        }
	        
	        return count;
	    }
	 
	 public static int numJewelsInStones(String jewels, String stones) {
		  boolean[] isJewel=new boolean[128];
	        char[] jewelsChr=jewels.toCharArray();
	        char[] stonesChr=stones.toCharArray();
	        for(int i=0;i<jewels.length();i++) {
	        	isJewel[jewels.charAt(i)]=true;
	        }
	        int count=0;
	        for(int i=0;i<stones.length();i++) {
	        	if(isJewel[stones.charAt(i)]) {
	        		count++;
	        	}
	        }
	        return count;
	    }

}
