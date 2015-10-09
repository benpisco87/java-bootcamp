package shoppingcart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shoppingcart.dao.UserDao;
import shoppingcart.model.User;
import shoppingcart.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	
	@Transactional
	public void add(User user) {
		userDao.add(user);
	}

	@Transactional
	public void edit(User user) {
		userDao.edit(user);
	}

	@Transactional
	public void delete(long id) {
		userDao.delete(id);
	}

	@Transactional
	public User getUser(long id) {
		return userDao.getUser(id);
	}

	@Transactional
	public List getAllUser() {
		return userDao.getAllUser();
	}

}
