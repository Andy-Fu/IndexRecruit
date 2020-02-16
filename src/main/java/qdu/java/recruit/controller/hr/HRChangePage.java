package qdu.java.recruit.controller.hr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HRChangePage {
	
	 @RequestMapping("/hr/tohr_login")
	    public String toHrLogin() {
	    	
			return "/hr/hr_login";
		}
	 @GetMapping("hr/hrcenter")
	 public String toHrInfo() {
		 return "hr/hr_info";
	 }
	 @GetMapping("hr/hr_index")
	 public String toHrIndex() {
		 return "hr/hr_index";
	 }

}
