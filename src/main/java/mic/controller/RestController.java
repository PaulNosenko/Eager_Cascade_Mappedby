package mic.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import mic.entity.User;
import mic.entity.UserRole;
import mic.repository.RoleDao;
import mic.repository.UserDao;
import mic.repository.UserRoleDao;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	UserDao userDao;
	
	@Autowired
	RoleDao roleDao;
	
	@Autowired
	UserRoleDao urDao;
	
	
	
	
	@RequestMapping(value = "/userRoles/{id}")
	public Set<UserRole> ur(@PathVariable long id){
		return userDao.findOne(id).getUserRoles();
	}
	
	@RequestMapping(value = "/rr/{id}")
	public Set<UserRole> ru(@PathVariable long id){
		return roleDao.findOne(id).getUserRoles();
	}
	
}
