package defaultPackage;
import java.util.*;
public class HashOb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Books> map=new HashMap<>();
		Books b=new Books("tere","hh",4,199);
		Books b1=new Books("tere","hh",4,199);
		Books b2=new Books("tere","hh",4,199);
        map.put("Books1",b);
        map.put("Books2",b1);
        map.put("Books3",b2);
        
        for(Map.Entry<String, Books> me:  map.entrySet()) 
        {
       	 System.out.println(me.getKey() + " and "+me.getValue().name+" and "+me.getValue()+" "+me.getValue());
        }
	}

}
class Books{
	String name,author;
	int id,price;
	public Books(String name, String author, int id, int price) {
		super();
		this.name = name;
		this.author = author;
		this.id = id;
		this.price = price;
	}
//	public String toString() {
//		return  "Name :"+name+" author :"+author+" id :"+id+" price :"+price;
//	}
}
