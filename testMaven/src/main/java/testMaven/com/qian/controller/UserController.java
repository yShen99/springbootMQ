package testMaven.com.qian.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import testMaven.com.qian.bean.user;
import testMaven.com.qian.service.user.UserServiceImpl;

/**
 * 
 */

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserServiceImpl userService;
	@RequestMapping(value="insertUser",method=RequestMethod.POST)
	public String insertUser(HttpServletRequest req,Model model){
		Map<String, Object> map = new HashMap<String, Object>();
		user record = new user();
		record.setAge(Integer.parseInt(req.getParameter("age")));
		record.setUserName(req.getParameter("name"));
		record.setPassword(req.getParameter("pwd"));
		userService.insert(record);
		map.put("record", record);
		model.addAttribute("user", record);
		return "userDetail";
	}
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest req){
		return new ModelAndView("userDetail");
	}
	
	@RequestMapping("/getUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		user user = userService.selectByPrimaryKey(userId);
		model.addAttribute("user", user);
		return "userDetail";
	}
	
	
	
	
}
