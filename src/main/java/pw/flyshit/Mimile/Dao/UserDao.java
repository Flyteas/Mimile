package pw.flyshit.Mimile.Dao;

import pw.flyshit.Mimile.Domain.User;

public interface UserDao {
	public User getUser(String username,String password); //通过用户名和密码获取User
}
