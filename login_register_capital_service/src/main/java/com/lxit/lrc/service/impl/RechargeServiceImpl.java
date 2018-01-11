package com.lxit.lrc.service.impl;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

import com.lxit.lrc.dao.RechargeDao;
import com.lxit.lrc.service.RechargeService;
import com.lxit.p2p.bean.Recharge;

@Service
@MapperScan(basePackages={"com.lxit.lrc.dao"})
public class RechargeServiceImpl implements RechargeService{

	@Resource
	RechargeDao rechargeDao;
	
	@Override
	public boolean insertRecharge(Recharge recharge) {
		return rechargeDao.insertRecharge(recharge);
	}
	
}
