package org.framestudy.spring_mybatis.test.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.pojos.Pager;
import org.framestudy.spring_mybatis.usermag.beans.UserInfo;
import org.framestudy.spring_mybatis.usermag.service.IUserService;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)	//使用JUnit测试的时候，启动Spring容器
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestUserService {
	//stackoverflow.com 网站	
	@Resource
	private IUserService userServiceImpl;
	
	@Ignore
	public void testbatchDeleteUserInfo(){
		List<UserInfo> users = new ArrayList<UserInfo>();
		
		UserInfo user1 = new UserInfo();
		user1.setId(5);
		UserInfo user2 = new UserInfo();
		user2.setId(6);
		
		users.add(user1);
		users.add(user2);
		
		int result = userServiceImpl.batchDeleteUserInfo(users);
		System.out.println(result);
	}
	
	@Test
	public void testGetUserListByMapToPager(){
		int page = 1;
		int rows = 5;
		String userName = "王";
		String loginName = "wang";
		int index = (page-1)*rows;
		
		Map map = new HashMap();
		map.put("index", index);
		map.put("rows", rows);
		map.put("page", page);
		map.put("userName", userName);
		map.put("loginName", loginName);
		map.put("age", 100);
		
		Pager pager = userServiceImpl.getUserListByMapToPager(map);
		
		System.out.println("查询到的总页数："+(pager.getTotalRows()/rows+1));
	
		for(Object user:pager.getDatas()){	//这里为什么是Object，不能写成UserInfo？
			System.out.println(user);
		}
	}
	
	@Ignore
	public void testBatchSaveUserInfo(){
		List<UserInfo> users = new ArrayList<UserInfo>();
		
		UserInfo user1 = new UserInfo(1, "王大锤", "wangdachui4", "121212", 23);
		try {
			UserInfo user2 = (UserInfo) user1.clone();
			user2.setLoginName("wangdachui5");
			UserInfo user3 = (UserInfo) user1.clone();
			user3.setLoginName("wangdachui6");
			UserInfo user4 = (UserInfo) user1.clone();
			user4.setLoginName("wangdachui7");
			
			users.add(user1);
			users.add(user2);
			users.add(user3);
			users.add(user4);
			
			int result = userServiceImpl.batcheSaveUserInfo(users);
			Assert.assertNotNull(result);
			System.out.println("影响的行数："+result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Ignore
	public void testQueryUserListByMap(){
		Map map = new HashMap();
		map.put("userName", "li");
		map.put("age", 16);
		List<UserInfo> users = userServiceImpl.queryUserListByMap(map);
		Assert.assertNotNull(users);
		for(UserInfo u:users){
			System.out.println(u.toString());
		}
	}
	
	
	@Ignore
	public void testSaveUserInfo(){
		userServiceImpl.saveUserInfo(new UserInfo(1, "sunwukong", "houzi", "11111", 23));
		userServiceImpl.deleteUserInfo(3);
		
		UserInfo user = userServiceImpl.getUserInfoById(8);
		System.out.println(user.toString());
		
		
		
		//userGeneratedKeys
		//keyProperty
	}
	
}
