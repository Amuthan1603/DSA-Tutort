package problems;

import java.util.Arrays;

public class BoatsToSavePeople881 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numRescueBoats(new int[] {3,2,2,1}, 3));
	}
	public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int start=0;
        int end=people.length-1;
        int c=0;
        while(start<=end){
            int sum=people[start]+people[end];
            if(sum<=limit){
                start++;
            }
            end--;
            c++;
        }
        return c;
    }
}
