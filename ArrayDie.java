import java.security.SecureRandom;
public class ArrayDie {

	public static void main(String[] args) {
		//roll a die 60_000_000 times, get the frequency and output it.
		int [] freq = new int[7];
		SecureRandom random = new SecureRandom(); //object 'random' of class SecureRandom
				
		//to get the random number loop
		for(int counter = 1; counter<= 60_000_000; counter++) {
			//save the generated random numbers in a corresponding array index which tallies with the newly generated random number
			freq[1 + random.nextInt(6)]=1+freq[1 + random.nextInt(6)];
		}
		System.out.printf("Face\tFrequency\n");
		//for loop to print the face of die (from 1-6) and its corresponding frequency
		for(int i=1;i<=6;i++) {
			System.out.printf("%4d\t%d\n",i,freq[i] );

		}
				
	}

}
