package JdbcDemoSpring.jdbcdemo1;


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
    	 ApplicationContext  context=new ClassPathXmlApplicationContext("config.xml");
    	 StudentOperations op=(StudentOperations)context.getBean("operationdemo");
    	 
    	 Student e1=new Student();
    	 e1.setEmail("ter");
    	 e1.setId("5");
    	 e1.setName("teres");
    	 e1.setSalary("5729");
    	 
	int result=     op.insert(e1);
System.out.print(result);
    	
    	
    	
       
    }
}
