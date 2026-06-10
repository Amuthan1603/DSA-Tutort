package learningFromClass;

public class MinimumWindowSubstring76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minWindow("ADOBECODEBANC","ABC"));
	}
	
	public static String minWindow(String s, String t) {
        int[] tCount=new int[128];
        for(char c:t.toCharArray()){
            tCount[c]++;
        }
        int left=0;
        int right=0;
        int minLen=Integer.MAX_VALUE;
        int startIndex=0;
        int count=t.length();
        while(right<s.length()){
            int rightChar=s.charAt(right);
            if(tCount[rightChar]>0){
                count--;
            }
            tCount[rightChar]--;
            right++;
            while(count==0){
                if(right-left<minLen){
                    minLen=right-left;
                    startIndex=left;
                }
                char leftChar=s.charAt(left);
                tCount[leftChar]++;
                if(tCount[leftChar]>0){
                    count++;
                }
                left++;
            }

        }
        return minLen==Integer.MAX_VALUE?"":s.substring(startIndex,startIndex+minLen);
    }

}
