package Day10.maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");
	        MessagePass pass=(MessagePass)context.getBean("msgpass");
	        pass.displaymsg();
	        Student stu=(Student)context.getBean("addressdet");
	        stu.displaymsg2();
	        Employee emp=(Employee)context.getBean("salarydet");
	        emp.displaysal();
    }
}
