package com.ibm.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ibm.entity.User;
import com.ibm.entity.UserDetail;
import com.ibm.service.UserService;



/**
 * �û�Controller��
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userservice;
	
	
	/**
	 * 登录
	 * @param user
	 * @param request
	 * @return
	 */
	@RequestMapping("/login")
	public String login(User user,HttpServletRequest request){
		Subject subject=SecurityUtils.getSubject();
		UsernamePasswordToken token=new UsernamePasswordToken(user.getUserName(), user.getPassword());
		try{
			subject.login(token);
			Session session=subject.getSession();
			System.out.println("sessionId:"+session.getId());
			System.out.println("sessionHost:"+session.getHost());
			System.out.println("sessionTimeout:"+session.getTimeout());
			//session.setAttribute("info", "session�����");
			return "redirect:/success.jsp";
		}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("user", user);
			request.setAttribute("errorMsg", "�û�����������");
			return "index";
		}
	}
	
	
	/**
	 * 查询所有员工信息
	 * @return
	 */
	@RequestMapping(value="/emplist")
	public String empList(Map<String,Object> map){
		
		List<UserDetail> emps = userservice.getEmpInfo();
		map.put("userInfo", emps);
		return "emplist";
	}
	
	@RequestMapping(value="/empEdit")
	public String empEdit(@RequestParam("id") Integer id,Map<String,Object> map){
		
		User Edit_user = userservice.getUserByUserId(id);
		
		map.put("edit_user", Edit_user);
		return "empedit";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value="/Regis")
	public String Regis(HttpServletRequest req){
		User userInfo = new User();
		userInfo.setId(1);
		userInfo.setEmail("AA@QQ.COM");
		userInfo.setPassword("123");
		userInfo.setUserName("xiaosan");
		req.setAttribute("userInfo", userInfo);
		return "Regis";
	}
	
	

}
