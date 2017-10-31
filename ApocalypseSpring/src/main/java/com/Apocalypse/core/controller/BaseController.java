package com.Apocalypse.core.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.util.Assert;

import com.Apocalypse.core.bean.CommonConstant;
import com.Apocalypse.member.bean.MemberBean;

public class BaseController {
	protected  static final String ERROR_MSG="errorMsg";
	
	public MemberBean getSessionMember(HttpServletRequest request){
		return (MemberBean) request.getSession().getAttribute(CommonConstant.USER_CONTEXT);
	}
	
	public void setSessionMember(HttpServletRequest request , MemberBean member){
		 request.getSession().setAttribute(CommonConstant.USER_CONTEXT,member);
	}
	/**
	 * 获取基于应用程序的url绝对路径
	 * 
	 * @param request
	 * @param url
	 *            以"/"打头的URL地址
	 * @return 基于应用程序的url绝对路径
	 */
	public final String getAppbaseUrl(HttpServletRequest request, String url) {
		Assert.hasLength(url, "url不能为空");
		Assert.isTrue(url.startsWith("/"), "必须以/打头");
		return request.getContextPath() + url;
	}
}
