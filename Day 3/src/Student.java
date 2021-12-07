
public class Student {
	String name;
	Student(String name){
	this.name=name;
	System.out.println("The name of the Student is "+name);
	}
	Student(){
	System.out.println("The name of the Student is unknown ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("teresa");

	}

}
