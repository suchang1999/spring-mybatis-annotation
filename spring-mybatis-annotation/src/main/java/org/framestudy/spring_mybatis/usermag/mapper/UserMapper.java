package org.framestudy.spring_mybatis.usermag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.framestudy.spring_mybatis.usermag.beans.UserInfo;

public interface UserMapper {
	public int saveUserInfo(UserInfo user);
	public int updateUserInfo(@Param("u") UserInfo user);	//取别名
	public int deleteUserInfo(int id);
	public UserInfo getUserInfoById(int id);
	
	public UserInfo getUserByLoginNameAndPwd(@Param("loginName")String loginName,@Param("pwd")String pwd);
	
	public List<UserInfo> queryUserListByMap(@Param("map")Map map);
	
	public int batcheSaveUserInfo(@Param("users")List<UserInfo> users);
	
	public int batchDeleteUserInfo(@Param("users")List<UserInfo> users);
	
	/**
	 * 分页，两个方法：1.统计满足查询条件的总数
	 * 			2.查询满足条件的所有数据
	 */
	public int countUserListByMapToPage(@Param("map")Map map);
	public List<?> getUserListByMapToPage(@Param("map")Map map);
	
}
