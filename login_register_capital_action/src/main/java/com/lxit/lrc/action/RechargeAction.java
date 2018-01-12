package com.lxit.lrc.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.lrc.service.RechargeService;
import com.lxit.p2p.bean.Pager;
import com.lxit.p2p.bean.Recharge;

@Controller
@ComponentScan(basePackages = ("com.lxit.lrc.service"))
public class RechargeAction {

	@Resource
	RechargeService rechargeService;

	@ResponseBody
	@RequestMapping("insertRecharge")
	public String insertRechargeService(@RequestBody Recharge recharge) {
		if (rechargeService.insertRecharge(recharge)) {
			return "true";
		}
		return "false";
	}

	@ResponseBody
	@RequestMapping("selectChozhi")
	public Pager<Recharge> selectChozhi(@RequestParam("userId") int userId, @RequestParam("type") String type,
			@RequestParam("pageIndex") int pageIndex, @RequestParam("pageSize") int pageSize) {
		Map<String, Object> map = new HashMap<>();
		Pager<Recharge> pager = new Pager<>();
		pager.setPageIndex(pageIndex);
		map.put("userId", userId);
		map.put("type", type);
		map.put("pageIndex", (pageIndex-1)*pageSize);
		map.put("pageSize", pageSize);
		pager.setPageSize(pageSize);
		pager.setSumCount((int)rechargeService.selectChozhiCount(map));
		pager.setData(rechargeService.selectChozhi(map));
		return pager;
	}
}
