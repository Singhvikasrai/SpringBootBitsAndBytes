package in.sp.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.sp.main.Dao.UserDao;
import in.sp.main.entity.User;

@SpringBootApplication
public class SpringbootProject6jdbcCrudApplication implements CommandLineRunner
{
	@Autowired
    private UserDao userDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootProject6jdbcCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		// insert method
//		User user2=new User("mohit","pakhi.@gmail.com","male","goa");
//		
//		boolean status = userDao.insertuser(user2);
//		if(status)
//		{
//			System.out.println("sucessfully");
//		}else
//		{
//			System.out.println("not sucessfully");
//		}
	
		User user=new User("Paki tyagi","pakhi.@gamil.com","female","noida");
		boolean status= userDao.updateUser(user);
		if(status) {
		System.out.print("sucessfully");
	}
	  else {
		System.out.print("Not sucessfully");
	}
	
	}
}
