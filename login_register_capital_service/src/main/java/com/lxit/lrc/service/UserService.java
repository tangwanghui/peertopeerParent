package com.lxit.lrc.service;

import com.lxit.p2p.bean.User;

public interface UserService {

	/**
	 * 锟矫伙拷注锟斤拷
	 * 
	 * @param user
	 * @return
	 */
	boolean insertUser(User user);

	User queryUserById(int userId);

	long checkRegister(String phone);
	
	User loginPost(User user);
	
	boolean updatePassWord(User user);
	
	boolean userchozhi(User user);
	/**
	 * 锟矫伙拷锟斤拷陆 锟矫伙拷锟斤拷锟斤拷锟斤拷锟斤拷
	 * 
	 * @param userName
	 * @param userPass
	 * @return
	 *//*
	User loginUser(String userName, String userPass);

	*//**
	 * 锟矫伙拷锟睫革拷锟斤拷息
	 * 
	 * @param user
	 * @return
	 *//*
	boolean updateUser(User user);

	*//**
	 * 锟矫伙拷锟斤拷锟矫伙拷删锟斤拷
	 * 
	 * @param userId
	 * @return
	 *//*
	boolean deleteUser(int userId);

	*//**
	 * 锟叫讹拷锟矫伙拷锟剿猴拷锟角凤拷锟斤拷锟�
	 * 
	 * @param phone
	 * @return
	 *//*
	boolean checkUser(String phone);*/
}
