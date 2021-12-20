package Day10.maven;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	 @Autowired
	 Salary sal;


	 public Salary getSal() {
		return sal;
	}


	public void setSal(Salary sal) {
		this.sal = sal;
	}


	void displaysal() {
		 sal.calculateSalary();
	 }

}
