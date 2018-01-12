package com.lxit.lrc.service.impl;

import java.util.List;
import java.util.Map;

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

	@Override
	public List<Recharge> selectChozhi(Map<String, Object> map) {
		return rechargeDao.selectChozhi(map);
	}

	@Override
	public long selectChozhiCount(Map<String, Object> map) {
		return rechargeDao.selectChozhiCount(map);
	}
	
	
	
}
