package com.leaf.interceptor;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局捕获异常
 * 
 * @author liu zh
 *
 */
@ControllerAdvice
public class MyControllerAdvice {

	private static final Logger LOG = LogManager.getLogger(MyControllerAdvice.class);

	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public Object exceptionHandler(Exception ex) {
		LOG.error("发生异常 = {}", ex.getMessage(), ex);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("mag", ex);
		return map;
	}
}
