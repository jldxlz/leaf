package com.leaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.leaf.Repository.UserDao;
import com.leaf.entity.User;

/**
 * 
 * @author liu zh
 *
 */
@RestController
public class UserController {

	@Autowired
	private UserDao userDao;

	@RequestMapping(value = "/addUser")
	public Object addUser(@RequestParam String name) {
		if (StringUtils.isEmpty(name)) {
			return "name 为空";
		}
		User user = new User();
		user.setName(name);
		userDao.save(user);
		return userDao.findAll();
	}

	@RequestMapping(value = "/getAllUsers")
	public Object getAllUsers() {
		User user = null;
		user.setName("123");
		return userDao.findAll();
	}

}
