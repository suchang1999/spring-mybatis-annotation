package org.framestudy.spring_mybatis.usermag.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.framestudy.spring_mybatis.usermag.beans.UserInfo;
import org.framestudy.spring_mybatis.usermag.dao.IUserDao;
import org.framestudy.spring_mybatis.usermag.mapper.UserMapper;
import org.framestudy.spring_mybatis.utils.SessionUtils;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {	
	
	private UserMapper um;	

	public void setSession(SqlSession session) {
//		this.session = session;
		um = session.getMapper(UserMapper.class);	//取得接口的实例
	}

	public int saveUserInfo(UserInfo user) {		
//		SqlSession session = SessionUtils.getSession();	//获得会话连接对象
//		um = session.getMapper(UserMapper.class);	//取得接口的实例
		
		return um.saveUserInfo(user);
	}

	public int updateUserInfo(UserInfo user) {
		return um.updateUserInfo(user);
	}

	public int deleteUserInfo(int id) {
		return um.deleteUserInfo(id);
	}

	public UserInfo getUserInfoById(int id) {
		return um.getUserInfoById(id);
	}

	public UserInfo getUserByLoginNameAndPwd(String loginName, String pwd) {		
		return um.getUserByLoginNameAndPwd(loginName,pwd);
	}

	public List<UserInfo> queryUserListByMap(Map map) {
		return um.queryUserListByMap(map);
	}

	public int batcheSaveUserInfo(List<UserInfo> users) {
		return um.batcheSaveUserInfo(users);
	}

	public int batchDeleteUserInfo(List<UserInfo> users) {
		return um.batchDeleteUserInfo(users);
	}

	public int countUserListByMapToPage(Map map) {
		// TODO Auto-generated method stub
		return um.countUserListByMapToPage(map);
	}

	public List<?> getUserListByMapToPage(Map map) {
		// TODO Auto-generated method stub
		return um.getUserListByMapToPage(map);
	}

}
