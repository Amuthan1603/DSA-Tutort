package learningFromClass;

public class ReverseOfWords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords("a good   example"));
	}
	
    public static String reverseWords(String s) {
        String[] words=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
