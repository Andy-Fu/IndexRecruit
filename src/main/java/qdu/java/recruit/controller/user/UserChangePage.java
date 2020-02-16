package qdu.java.recruit.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserChangePage {
	
	 @RequestMapping("/user/touser_login")
	    public String toHrLogin() {
	    	
			return "/user/user_login";
		}

}
