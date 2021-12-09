package defaultpackage;

import java.util.ArrayList;

public class Language {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Study> list=new ArrayList<>();
		Study s=new Study("java",9);
		Study s1=new Study("python",9);
		list.add(s);
		list.add(s1);
		for(Study e:list) {
			System.out.println(e.lang +" "+e.marks);
		}
		
		

	}

}

class Study{
	String lang;
	int marks;

	public Study(String lang, int marks) {
		super();
		this.lang = lang;
		this.marks = marks;
	}
	
}
