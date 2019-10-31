import java.security.SecureRandom;
public class ArrayRandom {
/*Class work: Write a code that shuffles an array of 20 numbers
 * Make sure the positions of the arrays are radomized
 * And the same element is repeated
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom rand = new SecureRandom();
//		int [][] array = {{1,2,3},{5,6,7},{9,10,11}};// hard coded array with uniform rows and columns
//		for(int x= 0; x<array.length;x++) {
//			for(int y = 0; y< array[x].length; y++) {
//				System.out.print(array[2][2] + " ");
//			}
//			System.out.println();
//			
//		}
//		System.out.println();
//		System.out.println();
//		
//		
//		int [][]newArray = new int [4][6];//multidimensional array with specified elements
//		 for(int row = 0; row< newArray.length; row++) {
//			 
//			 for(int col = 0; col< newArray[row].length; col++) {
//				 newArray[row][col] = col;
//				 System.out.print(newArray[row][col]+" ");
//			 }
//			 System.out.println();
//		 }
		
		 int [][]array1 = new int [4][];// specifying an inbalance in the column of an array
		 array1[0] = new int [8];
		 array1[1] = new int [2];
		 array1[2] = new int [4];
		 array1[3] = new int [6];
//		 array1[4] = new int [3];
		
		 for(int p=0; p< array1.length; p++) {
			 for( int q = 0; q< array1[p].length; q++) {
				 array1[p][q] = p;
				 System.out.print(array1[q] +" ");
			 }
			 System.out.println();
		 }
		 
		
	}

}
