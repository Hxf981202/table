package com.xxxx.manager.service;


import com.xxxx.commer.result.BaseResult;

import javax.servlet.http.HttpServletRequest;

/**
 * 发送短信
 *
 * @author 胡雪霏
 * @since 1.0.0
 */
public interface SendSmsService {

	/**
	 * 发送短信
	 * @param phone
	 * @return
	 */
	BaseResult sendSms(String phone, HttpServletRequest request);
}
