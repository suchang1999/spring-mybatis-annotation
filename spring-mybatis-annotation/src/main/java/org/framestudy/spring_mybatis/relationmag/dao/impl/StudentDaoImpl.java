package org.framestudy.spring_mybatis.relationmag.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.framestudy.spring_mybatis.relationmag.beans.Students;
import org.framestudy.spring_mybatis.relationmag.dao.IStudentDao;
import org.framestudy.spring_mybatis.relationmag.mapper.StudentMapper;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements IStudentDao {

	private StudentMapper sm;
	public void setSession(SqlSession session){
		sm = session.getMapper(StudentMapper.class);
	}
	
	public Students getStudentWithClassByStudentId(int id) {
		// TODO Auto-generated method stub
		return sm.getStudentWithClassByStudentId(id);
	}

}
