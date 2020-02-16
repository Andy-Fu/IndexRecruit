package cn.hongmao.util;



import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

public class SendSms {

	// 获取随机验证码
	public static int getCode() {
		return (int) ((Math.random() * 9 + 1) * 100000);
	}

	public static String SendMessage(String phone, int code) throws ServerException, ClientException {
		String msg = null;
		DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAIhmXM4qf7Dl1I",
				"s0rE0a19Tu1aHk8uqgcIIIfMHSuTZc");
		DefaultProfile.addEndpoint("cn-hangzhou","cn-hangzhou", "Dysmsapi", "dysmsapi.aliyuncs.com");
		IAcsClient client = new DefaultAcsClient(profile);
		SendSmsRequest request = new SendSmsRequest();
		request.setMethod(MethodType.POST);
		request.setPhoneNumbers(phone);
		request.setVersion("2017-05-25");
		request.setSignName("K短信在线验证");
		request.setTemplateCode("SMS_172010117");
		request.setTemplateParam("{\"code\":\"" + code + "\"}");
		SendSmsResponse response = client.getAcsResponse(request);
		System.out.println(response.getMessage());
		if (response.getCode() != null && response.getCode().equals("OK")) {
			System.out.println("短信发送成功！");
			msg = "短信发送成功！";
		} else {
			System.out.println("短信发送失败！");
			msg = "短信发送失败！";
		}
		return msg;
	}
}
