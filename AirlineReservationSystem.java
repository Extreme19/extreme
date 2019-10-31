import java.util.Scanner;
public class AirlineReservationSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean [] isFlight = new boolean[10];
		isFlight[0] = true;
		isFlight[1] = true;
		isFlight[2] = true;
	
		int firstClass [] = new int [5];
		int secondClass[] = new int [5];
		
		System.out.print("choose 1 for firstclass or 2 for economy class: ");
		if(input.nextInt() == 1) {
			for(int i = 0; i< firstClass.length; i++) {
				for(boolean checker : isFlight) {//checking for empty seat in first-class
					if(isFlight[i]== false) {
						firstClass[i] = i+1;
					}
					else { firstClass[i] = 0;}
				}
				System.out.println(firstClass[i]);
				
			}
		}
		
		
		else if(input.nextInt() == 2) {
			for(int i = 0; i< secondClass.length; i++) {
				for(boolean checker : isFlight) {//checking for empty seat in first-class
					secondClass[i] = i+6;
				}
			}
		}
		
		
		else {
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
