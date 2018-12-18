package Controller;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class HomeController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		
		String userName = ((ServletRequest) arg1).getParameter("name");
		System.out.println(userName);
		String password = ((ServletRequest) arg1).getParameter("password");
		System.out.println(password);
		
		if(userName==userName && password==password){
			System.out.println("Data is valid");
		}
		else{
			System.out.println("Data is invalid");
	}
		
		
		
		
		return null;
	}
	}



