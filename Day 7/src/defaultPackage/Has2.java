package defaultPackage;

import java.util.HashMap;
import java.util.Map;

public class Has2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<String,Integer> map=new HashMap<>();
         map.put("java",78);
         map.put("python",99);
         map.put("javascript",78);
         
         for(Map.Entry<String, Integer> me:  map.entrySet()) 
         {
        	 System.out.println(me.getKey() + ": "+me.getValue());
         }
	}

}
