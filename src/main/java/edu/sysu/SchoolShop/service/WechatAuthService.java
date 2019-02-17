package edu.sysu.SchoolShop.service;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import edu.sysu.SchoolShop.dto.WechatAuthExecution;
import edu.sysu.SchoolShop.entity.WechatAuth;

public interface WechatAuthService {

	/**
	 * 
	 * @param openId
	 * @return
	 */
	WechatAuth getWechatAuthByOpenId(String openId);

	/**
	 * 
	 * @param wechatAuth
	 * @param profileImg
	 * @return
	 * @throws RuntimeException
	 */
	WechatAuthExecution register(WechatAuth wechatAuth,
			CommonsMultipartFile profileImg) throws RuntimeException;

}
