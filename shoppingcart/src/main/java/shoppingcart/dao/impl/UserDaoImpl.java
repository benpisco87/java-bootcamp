package shoppingcart.dao.impl;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import shoppingcart.dao.UserDao;
import shoppingcart.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(User user) {
		session.getCurrentSession().save(user);
	}
	
	@Override
	public void edit(User user) {
		session.getCurrentSession().update(user);

	}

	@Override
	public void delete(long id) {
		session.getCurrentSession().delete(getUser(id));
	}

	@Override
	public User getUser(long id) {
		return (User)session.getCurrentSession().get(User.class, id);
	}

	public List getAllUser() {
		return session.getCurrentSession().createQuery("from User").list();
	}

}
