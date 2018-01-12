package com.lxit.lrc.service;

import java.util.List;
import java.util.Map;

import com.lxit.p2p.bean.Recharge;

public interface RechargeService {
	public boolean insertRecharge(Recharge recharge);
	
	public List<Recharge> selectChozhi(Map<String, Object> map);
	
	public long selectChozhiCount(Map<String, Object> map);
}
