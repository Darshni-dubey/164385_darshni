package DAO;

import org.springframework.jdbc.core.JdbcTemplate;

import Controller.Inbox;

public class User {

	private JdbcTemplate jdbcTemplate;  
	  
	public User(String username, String password) {
		
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	  
	public int saveUser(Inbox in){  
	    String query="INSERT INTO INBOX VALUES(' "+in.getUsername()+"','"+in.getPassword()+"')"; 
	    
	    
	    return jdbcTemplate.update(query);  
	}
	
	public int updateUser(Inbox in){  
	    String query="update Inbox set username='"+in.getUsername()+"'Password='"+in.getPassword()+"'";  
	    
	     return jdbcTemplate.update(query);  
	}

	public User updateUser(User user) {
		
		return user;
	}  
	
}
