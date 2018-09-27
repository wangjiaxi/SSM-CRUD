package cn.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ssm.dao.entity.UserEntity;
import cn.ssm.dao.mapper.UserMapper;
import cn.ssm.service.inter.UserServiceInter;

/**
 * 业务层实现类
 * 
 * @author Administrator
 *
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserServiceInter {
	// 注入dao层
	@Autowired
	public UserMapper mapper;

	public List<UserEntity> selectAllUser() {
		return mapper.selectAllUser();
	}

	@Transactional
	public int insertUserParams(UserEntity User) {
		return mapper.insertUserParams(User);
	}

	public UserEntity selectUserById(int id) {
		return mapper.selectUserById(id);
	}

	@Transactional
	public int delUserById(int id) {
		return mapper.delUserById(id);
	}

	public List<UserEntity> selectUserByLike(String keyWord) {
		return mapper.selectUserByLike(keyWord);
	}

	@Transactional
	public int updUserById(UserEntity User) {
		return mapper.updUserById(User);
	}
}
