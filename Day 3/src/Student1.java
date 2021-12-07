
public class Student1 {
	
  String name;
  int id;
    
	Student1(int id,String name){
		this.id=id;
		this.name=name;
		System.out.println("the student name is "+name+"\n the student id is "+id+"\n");
		
	}
	Student1(){
		System.out.println("the student name andid is unkouwm \n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student1 s1=new Student1(5,"rupesh");
     Student s=new Student("teresa");
     Student s2=new Student();
	}

}
