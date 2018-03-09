package mic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mic.entity.Role;
import mic.entity.User;
import mic.entity.UserRole;
import mic.repository.RoleDao;
import mic.repository.UserDao;
import mic.repository.UserRoleDao;

@SpringBootApplication
public class UserrolrApplication implements CommandLineRunner{

	@Autowired
	UserDao userDao;
	
	@Autowired
	RoleDao roleDao;
	
	@Autowired
	UserRoleDao urDao;
	
	public static void main(String[] args) {
		SpringApplication.run(UserrolrApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

		userDao.save(new User(null, "name1"));
		userDao.save(new User(null, "name2"));
		
		roleDao.save(new Role(null, "ADMIN"));
		roleDao.save(new Role(null, "USER"));

		urDao.save(new UserRole(userDao.findOne((long)1), roleDao.findOne((long)1)));
		urDao.save(new UserRole(userDao.findOne((long)1), roleDao.findOne((long)2)));
		urDao.save(new UserRole(userDao.findOne((long)2), roleDao.findOne((long)2)));
	}
}
