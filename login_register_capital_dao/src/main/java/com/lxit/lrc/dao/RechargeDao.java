package com.lxit.lrc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.lxit.p2p.bean.Recharge;

@Repository
public interface RechargeDao {
	public boolean insertRecharge(Recharge recharge);
	
	public List<Recharge> selectChozhi(Map<String, Object> map);
	
	public long selectChozhiCount(Map<String, Object> map);
}
