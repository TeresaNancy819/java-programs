package defaultPackage;
import java.util.*;

public class HashMapTraversal {
 public static void main(String[] args) {
	 
	 ArrayList<String> set=new ArrayList<>();
	 set.add("red");
	 set.add("red");
	 set.add("red");
	 set.add("black");
	 set.add("blue");
	 System.out.println(set);
	 ListIterator i=set.listIterator();
	 System.out.println("Forward Direction\n");
	 while(i.hasNext())
	 {
	 System.out.println(i.next());
	 }
	 System.out.println("\n");
	 System.out.println("Backward Direction\n");
	 while(i.hasPrevious())
	 {
	 System.out.println(i.previous());
	 }
	 Set<String> set1=new HashSet<>();
	 set1.add("red");
	 set1.add("red");
	 set1.add("red");
	 set1.add("black");
	 set1.add("blue");
	 System.out.println("Remove Duplicate values\n"+set1);
	 }}

	
