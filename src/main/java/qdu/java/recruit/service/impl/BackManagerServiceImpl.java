package qdu.java.recruit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qdu.java.recruit.entity.CompanyEntity;
import qdu.java.recruit.entity.UserAreaEntity;
import qdu.java.recruit.entity.UserEntity;
import qdu.java.recruit.entity.WebCountEntity;
import qdu.java.recruit.mapper.BackManagerMapper;
import qdu.java.recruit.service.BackManagerService;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

@Service
public class BackManagerServiceImpl implements BackManagerService{

    @Autowired
    private BackManagerMapper backManagerMapper;

    @Override
    public int backLogin(Long userid, String password) {
    	System.out.println(backManagerMapper.backLogin(userid,password));
    	try {
			 password = this.EncodingByMd5(password);
		} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println(backManagerMapper.backLogin(userid,password));
    	System.out.println(password);
        return backManagerMapper.backLogin(userid,password);
    }

    @Override
    public ArrayList<UserAreaEntity> userArea(){
        return backManagerMapper.userArea();
    }

    @Override
    public ArrayList<CompanyEntity> getAllCompanies() {
        return backManagerMapper.getAllCompanies();
    }

    @Override
    public ArrayList<UserEntity> getAllUsers() {
        return backManagerMapper.getAllUsers();
    }

    @Override
    public WebCountEntity getWebCount(){
        return backManagerMapper.getWebCount();
    }

    @Override
    public int addCompany(String companyName,String companyCode,String description){
        return backManagerMapper.addCompany(companyName,companyCode,description);
    }
    
    public String EncodingByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {

        //确定计算方法
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();

        //加密后的字符串
        String encStr = base64en.encode(md5.digest(str.getBytes("utf-8")));
        return encStr;
    }

}
