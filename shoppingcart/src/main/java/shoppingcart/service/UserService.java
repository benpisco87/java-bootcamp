package shoppingcart.service;

import java.util.List;

import shoppingcart.model.User;

public interface UserService {
	public void add(User user);
	public void edit(User user);
	public void delete(long id);
	public User getUser(long id);
	public List getAllUser();}
