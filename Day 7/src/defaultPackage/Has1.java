package defaultPackage;

import java.util.HashMap;
import java.util.Map;

public class Has1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<String, String> map=new HashMap<>();
         map.put("color1","red");
         map.put("color2","blue");
         map.put("color3","green");
         
         for(Map.Entry<String, String> me:  map.entrySet()) 
         {
        	 System.out.println(me.getKey() + ": "+me.getValue());
         }
	}

}
