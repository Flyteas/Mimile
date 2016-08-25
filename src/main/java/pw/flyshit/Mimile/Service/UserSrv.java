package pw.flyshit.Mimile.Service;

import pw.flyshit.Mimile.Domain.User;

public interface UserSrv 
{
	public User userLogin(String username,String password);
}
