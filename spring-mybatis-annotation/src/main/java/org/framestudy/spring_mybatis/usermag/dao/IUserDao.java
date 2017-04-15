package org.framestudy.spring_mybatis.usermag.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.framestudy.spring_mybatis.pojos.Pager;
import org.framestudy.spring_mybatis.usermag.beans.UserInfo;

public interface IUserDao {
	public int saveUserInfo(UserInfo user);
	public int updateUserInfo(UserInfo user);
	public int deleteUserInfo(int id);
	public UserInfo getUserInfoById(int id);
	
	public UserInfo getUserByLoginNameAndPwd(String loginName,String pwd);
	
	public List<UserInfo> queryUserListByMap(Map map);	//多参数传递方式map
	
	public int batcheSaveUserInfo(List<UserInfo> users);
	
	public int batchDeleteUserInfo(List<UserInfo> users);
	
	/**
	 * 分页，两个方法：1.统计满足查询条件的总数
	 * 			2.查询满足条件的所有数据
	 */
	public int countUserListByMapToPage(Map map);
	public List<?> getUserListByMapToPage(Map map);
	
}
