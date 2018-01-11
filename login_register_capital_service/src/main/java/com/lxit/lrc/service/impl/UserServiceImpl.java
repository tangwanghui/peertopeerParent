package com.lxit.lrc.service.impl;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

import com.lxit.lrc.dao.UserDao;
import com.lxit.lrc.service.UserService;
import com.lxit.p2p.bean.User;

@Service
@MapperScan(basePackages={"com.lxit.lrc.dao"})
public class UserServiceImpl implements UserService {
	
	@Resource
	UserDao userDao;

	@Override
	public boolean insertUser(User user) {
		return userDao.insertUser(user);
	}

	@Override
	public User queryUserById(int userId) {
		return userDao.queryUserById(userId);
	}

	@Override
	public long checkRegister(String phone){
		return userDao.checkRegister(phone);
	}

	@Override
	public User loginPost(User user) {
		return userDao.loginPost(user);
	}

	@Override
	public boolean updatePassWord(User user) {
		return userDao.updatePassWord(user);
	}

	@Override
	public boolean userchozhi(User user) {
		
		return userDao.userchozhi(user);
	}

	
	
	/*@Override
	public User loginUser(String userName, String userPass) {
		return userDao.loginUser(userName, userPass);
	}

	@Override
	public boolean updateUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public boolean deleteUser(int userId) {
		return userDao.deleteUser(userId);
	}

	@Override
	public boolean checkUser(String phone) {
		return userDao.checkUser(phone);
	}*/

}
