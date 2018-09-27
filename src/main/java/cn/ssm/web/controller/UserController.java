package cn.ssm.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.ssm.dao.entity.UserEntity;
import cn.ssm.service.inter.UserServiceInter;

@Controller
public class UserController {
	@Autowired
	public UserServiceInter service;

	
	@RequestMapping("/selectAllUser")
	public ModelAndView selectAllUser() {
		ModelAndView mav = new ModelAndView();
		List<UserEntity> list = service.selectAllUser();
		mav.addObject("UserList", list);
		mav.setViewName("list");
		return mav;
	}

	
	@RequestMapping("/insertUserParams")
	public String insertUserParams(UserEntity User) {
		service.insertUserParams(User);
		return "forward:selectAllUser";
	}

	
	@RequestMapping("/selectUserById")
	public ModelAndView selectUserById(int id, String type) {// type==edit 编辑 type==detail
		ModelAndView mav = new ModelAndView();
		UserEntity User = service.selectUserById(id);
		// 把数据放入model中
		mav.addObject("User", User);
		if ("detail".equals(type)) {// id查询
			mav.setViewName("detail");
		}
		if ("edit".equals(type)) {// 更新
			mav.setViewName("edit");
		}
		return mav;
	}

	
	@RequestMapping("/delUserById")
	public String delUserById(int id) {
		service.delUserById(id);
		return "forward:selectAllUser";
	}

	
	@RequestMapping("/selectUserByLike")
	public ModelAndView selectUserByLike(String keyWord) {
		ModelAndView mav = new ModelAndView();
		List<UserEntity> list = service.selectUserByLike(keyWord);
		mav.addObject("UserList", list);
		mav.setViewName("list");
		return mav;
	}

	
	@RequestMapping("/updUserById")
	public String updUserById(UserEntity User) {
		service.updUserById(User);
		return "forward:selectAllUser";
	}
}