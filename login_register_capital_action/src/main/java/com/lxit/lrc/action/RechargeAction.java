package com.lxit.lrc.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.lrc.service.RechargeService;
import com.lxit.p2p.bean.Recharge;

@Controller
@ComponentScan(basePackages=("com.lxit.lrc.service"))
public class RechargeAction {
	
	@Resource
	RechargeService rechargeService;
	
	@ResponseBody
	@RequestMapping("insertRecharge")
	public String insertRechargeService(@RequestBody Recharge recharge){
		if(rechargeService.insertRecharge(recharge)){
			return "true";
		}
		return "false";
	}
}
