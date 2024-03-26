package lectorial03;

public class GenericMethodDemo {
	public static <T> void printArray(T[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}		
	}
	
	public static void main(String[] args) {
		String[] names = {"Alice", "Bob"};
		System.out.println(names[3]);
		GenericMethodDemo.printArray(names);
		Integer[] numbers = {1, 2, 3, 45};
		GenericMethodDemo.printArray(numbers);
		
	}

}
