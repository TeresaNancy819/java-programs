package defaultPackage;
import java.util.*;
public class Has3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "Suraj");
		map.put(2, "xyz");
		map.put(3, "abc");
		map.put(4, "abcde");
		System.out.println(map+"\n");

		for(Map.Entry<Integer,String> me:map.entrySet())
		{
		System.out.println(me.getKey()+" : "+me.getValue());
		}
	}

}
