package com.lxit.lrc.dao;

import org.springframework.stereotype.Repository;

import com.lxit.p2p.bean.User;

/**
 * 锟矫伙拷dao锟斤拷
 * 
 * @author twh
 *
 */
@Repository
public interface UserDao {

	boolean insertUser(User user);
	
	User queryUserById(int userId);
	
	long checkRegister(String phone);
	
	User loginPost(User user);
	
	boolean updatePassWord(User user);
	
	boolean userchozhi(User user);
/*
	*//**
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

	*/
}
