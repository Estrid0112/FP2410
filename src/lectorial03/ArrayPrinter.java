package lectorial03;

class ArrayPrinter<T>{
    T[] objects;
    
    // optional: constructor
    
    // optional: getter and setter
    public void setObjects(T[] newArray) {
    	this.objects = newArray;
    }
    
    // print
    public void printArray() {
	    for (int i = 0; i< this.objects.length; i++) {
			System.out.println(this.objects[i]);
		}
    }
    
    public static void main(String[] args) {
		ArrayPrinter<Integer> myPrinter = new ArrayPrinter<Integer>();
		Integer[] data = {1, 2, 3, 4};
		myPrinter.setObjects(data);
		myPrinter.printArray();
	}
    
}
