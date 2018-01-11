package com.lxit.lrc.dao;

import org.springframework.stereotype.Repository;

import com.lxit.p2p.bean.Recharge;

@Repository
public interface RechargeDao {
	public boolean insertRecharge(Recharge recharge);
}
