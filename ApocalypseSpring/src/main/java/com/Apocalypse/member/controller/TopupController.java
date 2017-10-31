//package com.Apocalypse.member.controller;
//
//import java.io.UnsupportedEncodingException;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.Apocalypse.member.bean.MemberBean;
//import com.Apocalypse.member.service.IMemberService;
//
//@RestController
//@RequestMapping("/top.jsp")
//public class TopupController {
//
//	@Autowired
//	IMemberService memberService;
//
//	// 驗證使用者
//	public ModelAndView getMemberInfo(HttpServletRequest request) {
//		HttpSession session = request.getSession(false);
//		// 使用逾時
//		if (session == null) {
//			request.setAttribute("errorInfo", "連線逾時，請重新登入");
//			return new ModelAndView("redirect:index");
//		}
//		try {
//			request.setCharacterEncoding("UTF-8");
//			MemberBean memberBean = (MemberBean) request.getAttribute("LoginOK");
//
//			if (memberBean == null) {
//				request.setAttribute("errorInfo", "請登入或註冊新會員！");
//				return new ModelAndView("redirect:login");
//			}
//		} catch (UnsupportedEncodingException e) {
//			System.out.println("使用非UTF-8字型編碼");
//			e.printStackTrace();
//		}
//		return new ModelAndView("topupmain");
//
//	}
//}
