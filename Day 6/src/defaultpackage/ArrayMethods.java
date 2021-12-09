package defaultpackage;

import java.util.ArrayList;

public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an arraylist
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("JavaScript");
        list.add("Python");
        System.out.println("Programming Languages: " + list);

        list.clear();
        System.out.println("ArrayList after clear(): " + list);
        list.add("Java");
        list.add("JavaScript");
        list.add("Python");
        System.out.println("Programming Languages: " + list);
        
        
        
        list.removeAll(list);
        System.out.println("ArrayList after removeAll(): " + list);
	}

}
