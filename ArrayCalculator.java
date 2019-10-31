import java.util.Scanner;
public class ArrayCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner collect = new Scanner(System.in);
		int calc = 0;
		int arrayLength = 3;//custom array length
		int[] arrayOp1 = new int[arrayLength];
		int[] arrayOp2 = new int[arrayLength];
		int[] arrayResults = new int[arrayLength];
		char[] arrayOperator = new char[arrayLength];
		
		
		for(int i = 0; i<arrayLength; i++) {
			//try {
		System.out.println("Enter first operand: ");
		int op1 = collect.nextInt();
		arrayOp1[i]=op1;
		
		System.out.println("Enter second operand: ");
		int op2 = collect.nextInt();
		arrayOp2[i]=op2;
		
		System.out.println("Enter operator: ");
		char operator = collect.next().charAt(0);
		arrayOperator[i]= operator;
			//}
			
		
		switch(operator) {
		case '+' :
			calc = arrayOp1[i] + arrayOp2[i];
			arrayResults[i] =calc;
			break;
		case '-' :
			calc = arrayOp1[i] - arrayOp2[i];
			arrayResults[i] =calc;
			break;
		case '*' :
			calc = arrayOp1[i] * arrayOp2[i];
			arrayResults[i] =calc;
			break;
		case '/' :
			if(arrayOp2[i] == 0) {System.out.println("invalid division! this will be omitted, please continue");
			}
			else {
				calc = arrayOp1[i] / arrayOp2[i];
			arrayResults[i] =calc;
			}
			break;
		case '%' :
			calc = arrayOp1[i] % arrayOp2[i];
			arrayResults[i] =calc;
			break;
		case '^' :
			calc = (int) Math.pow(arrayOp1[i], arrayOp2[i]);
			arrayResults[i] =calc;
			break;
		default:
			break;
		}	
			
			
			
//			catch(Exception e) {
//				
//			System.err.println("error!...input is: "+e.getMessage());
//			break;
//			
//			}
			
			
		
		}//forloop ends
		
		
		System.out.printf("First operand\tSecond Operand\tOperator\tResult\n");
		for(int j = 0; j<arrayLength; j++) {
			System.out.printf("%5d\t\t%5d\t\t%s\t\t%5d",arrayOp1[j], arrayOp2[j],arrayOperator[j], arrayResults[j]);
			System.out.println();
		}
		

		
		
		
	}
		
		
				
		
		
		
		
}


