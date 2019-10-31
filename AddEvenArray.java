import java.security.SecureRandom;
public class AddEvenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// class work:
		/*Write a code that
		 * generate 20 random numbers between 0 to 20
		 * add all the even numbers between excluding 20
		 *make use of enhanced for loop 
		 *
		 * PSEUDO CODE
		 * generate random numbers  20 times and save as an array
		 * check each number in the saved array and add the even numbers therein except 20*/
		int [] numbers = new int [20];
		SecureRandom rand = new SecureRandom();
		int sum = 0;
		System.out.print("Random numbers= ");
		for(int i = 0; i < numbers.length; i++) {

		int random = rand.nextInt(21);
		numbers[i] = random;
		System.out.print(numbers[i]+"  ");
		}
		System.out.println();
		System.out.print("The even numbers therein are:  ");
		for(int even : numbers) {
			if(even % 2  == 0 && even != 20) {
				sum += even;
				System.out.print(even+" ");
			}
		}
		System.out.println();
		System.out.print("Total of even numbers excluding 20 is: " + sum);
		
		
	}

}
