package com.lxit.lrc.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.lrc.service.UserService;
import com.lxit.p2p.bean.User;

@Controller
@ComponentScan(basePackages=("com.lxit.lrc.service"))
public class UserAction {
	
	@Resource	
	UserService userService;
	
	@ResponseBody
	@RequestMapping("/loginUser")
	public User loginUser(@RequestBody User user){
		return userService.loginPost(user);
	}
	
	@ResponseBody
	@RequestMapping("/insertUser")
	public String insertUser(@RequestBody User user){
		if(userService.insertUser(user)){
			return "true";
		}
		return "false";
	}
	
	@ResponseBody
	@RequestMapping("/queryUserById")
	public User queryUserById(@RequestParam("userId")int userId){
		return userService.queryUserById(userId);
	}
	
	@ResponseBody
	@RequestMapping("/checkRegister")
	public String checkRegister(@RequestParam("phone") String phone){
		if(userService.checkRegister(phone)>0){
			return "true";
		}
		return "false";
	}
	
	@ResponseBody
	@RequestMapping("userUpdatePass")
	public String updatePassWord(@RequestBody User user){
		if(userService.updatePassWord(user)){
			return "true";
		}else{
			return "false";
		}
	}
	
	@ResponseBody
	@RequestMapping("userChoZhi")
	public String userChoZhi(@RequestBody User user){
		if(userService.userchozhi(user)){
			return "true";
		}else{
			return "false";
		}
	}
}
