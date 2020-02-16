package qdu.java.recruit.service;

import qdu.java.recruit.entity.HREntity;

public interface HRService {

    HREntity getHR(int hrId);

    boolean updateHR(HREntity HREntity);

    boolean registerHR(HREntity HREntity);

    boolean loginHR(String mobile, String password);

    HREntity getHRByMobile(String mobile);

	/**
	 * 根据用户id修改头像(图片)
	 * 
	 * @param userId 用户id
	 * @param image
	 * @return 影响行数
	 */
	public boolean updateImage(Integer userId, String image);
}
