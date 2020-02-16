package cn.hongmao.util;



import java.util.UUID;

/**
 * 图片重命名工具类
 * 
 * @author yanlianshan
 *
 */
public class RenamePhoto {
	/**
	 * 生成UUID字符串
	 * @return
	 */
	public static String renamePhoto() {
		String string = UUID.randomUUID().toString().replace("-", "");
		return string;
	}
}
