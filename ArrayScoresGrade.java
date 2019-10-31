import java.util.Scanner;
public class ArrayScoresGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number of students to be assessed: ");
		int numOfStudents = obj.nextInt() ;
		int firstNum [] = new int [numOfStudents];
		int secondNum [] = new int  [numOfStudents];
		for(int i = 0; i < numOfStudents; i++) {
		System.out.print("Enter first C.A Score: ");
		firstNum[i] = obj.nextInt();
		System.out.print("Enter second C.A Score: ");
		secondNum[i] = obj.nextInt();
		
		}
		System.out.println();
		 //int [][] multiNum = new int [firstNum.length][secondNum.length];
		System.out.println("First Assesment results");
		System.out.printf("Score\tGrade\n");
		for (int check : firstNum) {
			switch(check/10) {
			
			case 10:
			case 9:
			case 8:
			case 7:
				System.out.printf(check + "\tA");
				break;
			case 6:
				System.out.printf(check + "\tB");
				break;
			case 5:
				System.out.printf(check + "\tC");
				break;
			case 4:
				System.out.printf(check + "\tE");
				break;
			case 3:
			case 2:
			case 1:
				System.out.printf(check + "\tFail!!");
				break;
			default:
				System.out.printf(check + "\tError not within score range!");
				break;
			
			
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Second Assesment results");
		System.out.printf("Score\tGrade\n");
		for (int check : secondNum) {
			switch(check/10) {
			case 10:
			case 9:
			case 8:
			case 7:
				System.out.printf(check + "\tA");
				break;
			case 6:
				System.out.printf(check + "\tB");
				break;
			case 5:
				System.out.printf(check + "\tC");
				break;
			case 4:
				System.out.printf(check + "\tE");
				break;
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.printf(check + "\tFail!!");
				break;
			default:
				System.out.printf(check + "\tError! not within score range");
				break;
			
			
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
