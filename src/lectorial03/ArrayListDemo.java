package lectorial03;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
	    ArrayList<String> arrayList = new ArrayList<String>();
	    
	    arrayList.add(new String("One"));
	    arrayList.add(new String("Three"));
	    arrayList.add(new String("Five"));
	    arrayList.add(new String("Four"));
	    arrayList.add(1,new String("Two"));
	    
	    arrayList.remove(3);
	    arrayList.add(4,"Five");
	    System.out.println("Displaying array list");
	    System.out.println(arrayList);
	    System.out.println(arrayList.getLast());

	}
}
