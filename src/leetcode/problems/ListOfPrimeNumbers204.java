package problems;

import java.util.Arrays;

public class ListOfPrimeNumbers204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findPrimeNumbers(10);
	}

	private static void findPrimeNumbers(int n) {
		// TODO Auto-generated method stub
		boolean[] prime = new boolean[n];
		Arrays.fill(prime, true);
		prime[0]= false;
		prime[1]=false;
		for(int i=2;i*i<n;i++) {
			if(prime[i]) {
				for(int j=i*i;j<n;j+=i) {
					prime[j]=false;
				}
			}
		}
		for(int k=0;k<n;k++) {
			System.out.println(k+" "+ prime[k]);
		}
	}
	
	

}
