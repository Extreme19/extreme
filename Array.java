
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] joeArray = new int[10];
		int value = 10;
		int index = 0;
		joeArray[0] = 0;
		System.out.println("Index	Value");
		for(int i = 0; i<joeArray.length; i++) {
			index =i;
			value--;
			System.out.printf("%5d\t%5d\n", index, value);
		}
	}

}
