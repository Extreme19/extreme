
public class ArrayBarChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to print 0-9, 10-19...90-99, 100 with each rAnge printing the elemnt number of stars in corresponding index.
		int [] arrayBar = {0,0,0,0,0,0,1,2,4,2,1};
		
		System.out.println("Grade distribution: ");
		//overall loop
		for(int i = 0; i< arrayBar.length; i++) {
			//to treat 100 differently
			if(i*10==100) {
				System.out.printf("%5d: ", i*10);
				//star printing loop
				for(int j =1; j<=arrayBar[i];j++) {
					System.out.print('*');
				}
			}
						else {
			if(arrayBar[i]== 0) {
				System.out.printf("%02d-%02d: ", i*10,(i*10)+9);
			}
			else {
				System.out.printf("%02d-%02d: ", i*10,(i*10)+9);
				for(int j =1; j<=arrayBar[i];j++) {
					System.out.print('*');
				}
			}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
