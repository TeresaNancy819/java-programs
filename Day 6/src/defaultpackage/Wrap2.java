package defaultpackage;

import java.util.ArrayList;

public class Wrap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> list=new ArrayList<>();//Object
	        list.add(567);
	        list.add(67890);
	        list.add(14);

	        for(int x  : list)
	        {
	        System.out.println(x);    
	        }
	}

}
