package JdbcDemoSpring.jdbcdemo1;

import org.springframework.jdbc.core.JdbcTemplate;


public class StudentOperations {
	JdbcTemplate jdbcTemplate;
	
	 public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	 {
		 this.jdbcTemplate=jdbcTemplate; 
	 }
	
	
	

	int insert(Student emp)
	 {
		 
		 String email=emp.getEmail();
		 String name=emp.getName();
		 String id=emp.getId();
		 String salary=emp.getSalary();
		 
		   String query="insert into Student values('"+name+"','"+email+"','"+id+"','"+salary+"')"; 
		        int result= jdbcTemplate.update(query);
		 
		 return  result;
	}

}
