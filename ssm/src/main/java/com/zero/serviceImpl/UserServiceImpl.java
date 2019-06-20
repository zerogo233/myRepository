package com.zero.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zero.mapper.UserMapper;
import com.zero.pojo.User;
import com.zero.pojo.UserExample;
import com.zero.service.UserService;

@Service
@Transactional //事务
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void addUser(User users) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> findUserAll() {
		
		UserExample userExample = new UserExample();
		
		List<User> list = userMapper.selectByExample(userExample);
		return list;
	}

	@Override
	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User users) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserById(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
