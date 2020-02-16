package qdu.java.recruit.controller.general;

import io.swagger.annotations.Api;
import qdu.java.recruit.entity.UserEntity;
import qdu.java.recruit.service.UserService;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


import cn.hongmao.util.RenamePhoto;

@Controller
@EnableAutoConfiguration
public class GeneralController {

    /**
     * 注册
     *
     * @return
     */
    @GetMapping(value = "/register")
    public String userRegister() {
        return "general/register";
    }
    @RequestMapping("/testfile")
    public String toTestfile() {
    	return "/testfile";
    }
    @RequestMapping("/hr/index")
    public String toHrIndex() {
    	return "/user/index";
    }
    
    @RequestMapping("/user/index")
    public String toIndex() {
    	return "/user/index";
    }
    
   

}
