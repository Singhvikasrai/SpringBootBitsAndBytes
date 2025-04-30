package in.sp.main.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.sp.main.entity.User;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean insertuser(User user) 
	{
		boolean status = false;
	
	
	try
	{
		String INSERT_SQL_QUERY = "INSERT INTO users(name,email,gender, city) VALUES(?,?,?,?)";
		int count =jdbcTemplate.update(INSERT_SQL_QUERY,user.getName(),user.getEmail(),user.getGender(),user.getCity());
		if(count>0)
		{
			status = true;
		}
		else
		{
			status = false;
		}
		
		
	}
	catch(Exception e)
	
	{
		status = false;
		e.printStackTrace();
	}
	return status;
	
	}
	public boolean updateUser(User user)
	{
		boolean status = false;
	
	
	
	try
		{
			String updatea_sql_query="update users set name=?, gender=?, city=? WHERE email=?";
			int count= jdbcTemplate.update(updatea_sql_query,user.getName(), user.getGender(),user.getCity(),user.getEmail());
			if(count>0)
			{
				status = true;
			}
			else
			{
				status = false;
			}
			
			
		}
		catch(Exception e)
		
		{
			status = false;
			e.printStackTrace();
		}
		  return status ;
		
		}
}



