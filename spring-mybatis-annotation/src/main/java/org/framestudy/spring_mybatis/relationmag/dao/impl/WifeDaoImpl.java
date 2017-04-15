package org.framestudy.spring_mybatis.relationmag.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.framestudy.spring_mybatis.relationmag.beans.Wife;
import org.framestudy.spring_mybatis.relationmag.dao.IWifeDao;
import org.framestudy.spring_mybatis.relationmag.mapper.WifeMapper;
import org.springframework.stereotype.Repository;

@Repository
public class WifeDaoImpl implements IWifeDao{

	private WifeMapper wm;
	
	public void setSession(SqlSession session){
		wm = session.getMapper(WifeMapper.class);
	}

	public Wife getWifeWithHusbandByWifeId(int id) {
		// TODO Auto-generated method stub
		return wm.getWifeWithHusbandByWifeId(id);
	}
	
}
