import java.security.SecureRandom;

public class UniqueRandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom random = new SecureRandom();
		int [] arrayRandom = new int[4];
		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;
		int counter4 = 0;
		 
		for(int i = 0; i < arrayRandom.length; i++) {
		int randomNumber = 1 + random.nextInt(4);
			    switch(randomNumber) {
			    case 1:
			    	++counter1;
			    	if (counter1==1) {
			    		break;
			    	}
			    		else {
			    		arrayRandom[i] = 1;
			    	}
			    	break;
			    case 2:
			    	++counter2;
			    	if (counter2==1) {
			    		break;
			    	}
			    		else {
			    		arrayRandom[i] = 2;
			    	}
			    	break;	
			    case 3:
			    	++counter3;
			    	if (counter3==1) {
			    		break;
			    	}
			    		else {
			    		arrayRandom[i] = 3;
			    	}
			    	break;
			    case 4:
			    	++counter4;
			    	if (counter4==1) {
			    		break;
			    	}
			    		else {
			    		arrayRandom[i] = 4;
			    	}
			    	break;			    
		    }	    	
			    arrayRandom[i]= randomNumber;
			    System.out.println(arrayRandom[i]);
	}

}
}
