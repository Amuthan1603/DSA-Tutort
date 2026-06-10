package learningFromClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findAnagrams("cbaebabacd", "abc");
	}

	 public static List<Integer> findAnagrams(String s, String p) {
	        List<Integer> li=new ArrayList<>();
	        if(s==null || p==null || s.length()<p.length())
	            return li;
	        int[] pCount=new int[26];
	        int[] sCount=new int[26];
	        for(char c:p.toCharArray()){
	            pCount[c-'a']++;
	        }
	        int windowLength=p.length();
	        for(int i=0;i<windowLength;i++){
	            sCount[s.charAt(i)-'a']++;
	        }
	        for(int i=windowLength;i<s.length();i++){
	            if(Arrays.equals(sCount,pCount)){
	                li.add(i-windowLength);
	            }
	            sCount[s.charAt(i)-'a']++;
	            sCount[s.charAt(i-windowLength)-'a']--;
	        }
	         if(Arrays.equals(sCount,pCount)){
	                li.add(s.length()-windowLength);
	            }
	         for(int i:li) {
	        	 System.out.println(i);
	         }
	        return li;
	    }
}
