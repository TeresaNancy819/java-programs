package defaultPackage;

import java.util.HashMap;
import java.util.Map;

public class HasMa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HashMap<String, String> map=new HashMap<>();
         map.put("key1","xyz");
         map.put("key2","teresa");
         map.put("key3","rup");
         
         for(Map.Entry<String, String> me:  map.entrySet()) 
         {
        	 System.out.println(me.getKey() + "and "+me.getValue());
         }
         
         
	}

}
