package Day10.maven;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Salary {
	public Salary() {
	  System.out.println("employee salary");
	}
   void calculateSalary() {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("enter employee 1 day salary: ");
	   int sal=scan.nextInt();
	   int monthly=sal*30;
	   int yearly=monthly*12;
	   System.out.println("the annual income od employee is: "+yearly);
   }
}
