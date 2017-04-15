package org.framestudy.spring_mybatis.relationmag.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.framestudy.spring_mybatis.relationmag.beans.Classes;
import org.framestudy.spring_mybatis.relationmag.dao.IClassDao;
import org.framestudy.spring_mybatis.relationmag.mapper.ClassMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ClassDaoImpl implements IClassDao {

	private ClassMapper cm;
	public void setSession(SqlSession session){
		cm = session.getMapper(ClassMapper.class);
	}
	
	public Classes getClassesWithStusByClassId(int id) {
		// TODO Auto-generated method stub
		return cm.getClassesWithStusByClassId(id);
	}

}
