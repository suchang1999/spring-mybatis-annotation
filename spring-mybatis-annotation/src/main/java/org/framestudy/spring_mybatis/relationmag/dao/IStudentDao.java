package org.framestudy.spring_mybatis.relationmag.dao;

import org.framestudy.spring_mybatis.relationmag.beans.Students;

public interface IStudentDao {
	public Students getStudentWithClassByStudentId(int id);
}
