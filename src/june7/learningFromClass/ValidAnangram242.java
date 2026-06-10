package learningFromClass;

public class ValidAnangram242 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("anagram", "nagaram"));
	}
	
	public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            System.out.println(freq[s.charAt(i) - 'a']++);
            freq[t.charAt(i) - 'a']--;
            System.out.println(freq[t.charAt(i) - 'a']--);
        }
        for (int f : freq) {
            if (f != 0)
                return false;
        }
        return true;
    }

}
