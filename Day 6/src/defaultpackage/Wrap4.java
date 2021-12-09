package defaultpackage;

import java.util.ArrayList;

public class Wrap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Studentt> list=new ArrayList<>();
		Studentt s=new Studentt("Teresa","Present");
		Studentt s1=new Studentt("Rupesh","Abset");
		list.add(s);
		list.add(s1);
		for(Studentt e:list) {
			System.out.println(e.name +"and"+e.status);
		}
		
		

	}

}

class Studentt{
	String name,status;

	public Studentt(String name, String status) {
		super();
		this.name = name;
		this.status = status;
	}
	
}
