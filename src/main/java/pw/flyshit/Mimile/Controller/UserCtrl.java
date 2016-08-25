package pw.flyshit.Mimile.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pw.flyshit.Mimile.Domain.User;
import pw.flyshit.Mimile.Service.UserSrv;


@Controller
public class UserCtrl 
{
	@Autowired
	private UserSrv userSrv;
	
	@RequestMapping(value = { "/Index.do" }, method = RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception
	{
		String msg;
		User user;
		ModelAndView mv = new ModelAndView();
		String username;
		String password;
		username = (String)request.getAttribute("username");
		password = (String)request.getAttribute("password");
		user = userSrv.userLogin(username, password);
		if(user == null)
		{
			msg = "登陆失败";
			mv.addObject("msg",msg);
			mv.setViewName("loginerr");
		}
		return mv;
	}
}
