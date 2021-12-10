package defaultPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashObj2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		HashMap<String,Teacher> map=new HashMap<>();
		System.out.println("enter the number of teachers info ");
		int num=scan.nextInt();
		int k=1;
		for(int i=0;i<num;i++) {
		System.out.println("enter the teacher details");
	    String name=scan.next();
	    String clas=scan.next();
	    int id=scan.nextInt();
		Teacher b=new Teacher(name,clas,id);
        map.put("Teacher",b);
        k++;}
        
        for(Map.Entry<String, Teacher> me:  map.entrySet()) 
        {
       	 System.out.println(me.getKey() + " and "+me.getValue().name+" "+me.getValue().clas+ " " +me.getValue().id);
        }
	}

}
class Teacher{
	String name, clas;
	int id;
	public Teacher(String name, String clas, int id) {
		super();
		this.name = name;
		this.clas = clas;
		this.id = id;
	}
}
