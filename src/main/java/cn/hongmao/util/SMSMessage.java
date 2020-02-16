package cn.hongmao.util;



import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

import cn.hongmao.util.SMSConfig;

public class SMSMessage {
	public static int getCode() {
		return (int)((Math.random()*9+1)*10000);
	}
	public static String sendMessage(String phone ,int code) {
		DefaultProfile profile = DefaultProfile.getProfile(SMSConfig.RegionID, SMSConfig.id,SMSConfig.pass); 
		String message=null;
		try {
			DefaultProfile.addEndpoint(SMSConfig.RegionID,SMSConfig.RegionID,SMSConfig.product, SMSConfig.Domain);
		} catch (ClientException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		IAcsClient client = new DefaultAcsClient(profile);
		SendSmsRequest request=new SendSmsRequest();
		request.setMethod(MethodType.POST);
		request.setPhoneNumbers(phone);
		request.setSignName(SMSConfig.signName);
		request.setTemplateParam("{\"code\":\""+code+"\"}");
		request.setVersion(SMSConfig.version);
		request.setTemplateCode(SMSConfig.Template);
		try {
			SendSmsResponse response=client.getAcsResponse(request);
			if(response.getCode()!=null&&response.getCode().equals("OK")) {
				message="短信发送成功";
			}else {
				message="短信发送失败";
			}
		} catch (ServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(message);
		return message;
	}
}
