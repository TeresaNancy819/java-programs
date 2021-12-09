package defaultpackage;

import java.util.ArrayList;

public class Wrap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ArrayList<Employee> list=new ArrayList<>();
          Employee e1=new Employee("Teresa",45);
          Employee e2=new Employee("Rupesh",46);
          Employee e3=new Employee("unjsjk",100);
          list.add(e1);
          list.add(e2);
          list.add(e3);
           for(Employee e:list) {
        	   System.out.println(e.getName()+" and "+e.getId());
           }
	}

}
class Employee
{
	String name;
	int id;
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
