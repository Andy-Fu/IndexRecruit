package qdu.java.recruit.service;

import qdu.java.recruit.entity.UserEntity;

public interface UserService {

    UserEntity getUser(int userId);

    boolean updateUser(UserEntity userEntity);

    boolean registerUser(UserEntity userEntity);

    boolean loginUser(String mobile, String password);

	/**
	 * 根据用户id修改头像(图片)
	 * 
	 * @param userId 用户id
	 * @param image
	 * @return 影响行数
	 */
	public boolean updateImage(Integer userId, String image);

    UserEntity getUserByMobile(String mobile);
    
}
