package defaultPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ArrayLi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<String> list=new ArrayList<String>();
       list.add("teresa");
       list.add("rupesh");
       list.add("mono");
       int size = list.size();
       
       System.out.println("Size of list = " + size);
       ArrayList<String> list1=new ArrayList<String>();
       list1.add("teresa");
       list1.add("rupesh");
       list1.add("mono");
       list1.add("babe");
       list1.clear();
       ArrayList<ArrayList<String>> list2=new ArrayList<>();
       list2.add(list);
       list2.add(list1);
       
       //equals
       if (list1.equals(list2) == true) {
           System.out.println(" Array List are equal");
       }
           else {
             
                   System.out.println(" Array List are not equal");
               }
       
       //isempty
       boolean ans = list1.isEmpty();
       if (ans == true)
           System.out.println("The  list1 ArrayList is empty");
       else
           System.out.println("The list1 ArrayList is not empty");
       System.out.println(list2);
       
       //get()
       List<Integer> list3= new LinkedList<>();  
         list3.add(5);  
        list3.add(56);  
        list3.add(509);  
        int index =list3.get(2);  
        System.out.println("Element "+-1+" stored at Index : "+index);  
       
       
       //setkey()
       HashMap map = new HashMap();
       map.put(1, "teres");
       map.put(2, "rupe");
       map.put(3, "is best");
       map.put(4,"go on");
       
       Set keyset = map.keySet();
       System.out.println("Key set values are: " + keyset);
       map.putAll(map);
       System.out.println("The new map looks like this: " + map);
       
       
       
       //replace
       String s1="my name is teresa";  
       String replaceString=s1.replace("is","was"); 
       System.out.println(replaceString);  
       
       
       //remove
       System.out.println("Removed Element: " +map.remove(2));
       
       boolean contains = map.containsKey(1);  
       System.out.println("1 has a mapping: "+contains);  
       contains = map.containsKey(2);  
       System.out.println("2 has a mapping: "+contains);
       
       
       
//       for(ArrayList e:list2)
//       {
//    	   System.out.println(e);
//       }
       
	}

}

