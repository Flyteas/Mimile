package pw.flyshit.Mimile.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pw.flyshit.Mimile.Dao.UserDao;
import pw.flyshit.Mimile.Domain.User;
import pw.flyshit.Mimile.Service.UserSrv;

@Service
public class UserSrvImpl implements UserSrv{

	@Autowired
	private UserDao userDao;
	@Override
	public User userLogin(String username, String password) 
	{
		return userDao.getUser(username, password);
	}

}
