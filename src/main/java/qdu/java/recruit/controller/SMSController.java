package qdu.java.recruit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.hongmao.util.SendSms;

import static qdu.java.recruit.util.SMSUtil.Sender.sendCode;
import static qdu.java.recruit.util.SMSUtil.Verify.verifyCode;

@RestController
@RequestMapping(value = "sms")
public class SMSController {
	private int bcode = SendSms.getCode();

    @ResponseBody
    @PostMapping(value = "/sendCode")
    public void smssendCode(@RequestParam String mobile){
    sendCode(mobile);
    }

    @ResponseBody
    @PostMapping(value = "/verifyCode")
    public String smsverifyCode(@RequestParam String mobile,@RequestParam String code){
        
        if (code.equals(String.valueOf(bcode))) {
        	 return "1";
		}else {
			  return "0";
		}
       
    }
    
    @ResponseBody
	@PostMapping("/regist/getCode")
	public String getCode(String phone, ModelMap map) {
		String msg1 = null;
		System.out.println(bcode);

		try {
			msg1 = SendSms.SendMessage(phone, bcode);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put("msg1", msg1);
		return msg1;

	}

}

