package defaultPackage;

import java.util.HashMap;
import java.util.Map;

public class HashObj1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Employee> map=new HashMap<>();
		Employee b1=new Employee("tere",4,199);
		Employee b2=new Employee("tere",4,199);
		Employee b3=new Employee("tere",4,199);
        map.put("Employee1",b1);
        map.put("Employee2",b2);
        map.put("Employee3",b3);
        
        for(Map.Entry<String, Employee> me:  map.entrySet()) 
        {
       	 System.out.println(me.getKey() + " and "+me.getValue().name+" "+me.getValue().salary+ " " +me.getValue().id);
        }
	}
	}

class Employee{
	String name;
	int salary,id;
	public Employee(String name, int salary, int id) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
	}
	
}