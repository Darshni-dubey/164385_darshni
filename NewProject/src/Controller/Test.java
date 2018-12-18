package Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DAO.User;

public class Test {
	public static void main(String[] args) {  
	    ApplicationContext context=new ClassPathXmlApplicationContext("Servlet.xml");  
	      
	    User dao=(User)context.getBean("dao");
	    User status=dao.updateUser(new User("darshni","123"));  
	    System.out.println(status); 
}
}