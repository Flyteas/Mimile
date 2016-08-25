package pw.flyshit.Mimile.Dao.Impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

import pw.flyshit.Mimile.Dao.UserDao;
import pw.flyshit.Mimile.Domain.User;

public class UserDaoImp implements UserDao{

	private HibernateTemplate ht;
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) 
	{
		ht = new HibernateTemplate(sessionFactory);
	}
	
	@Override
	public User getUser(String username, String password) 
	{
		String hql = "from User where userName=? and passWord=?";
		List<User> users;
		users = (List<User>) ht.find(hql,username,password);
		if(users.isEmpty())
			return null;
		return users.get(0);
	}

}
