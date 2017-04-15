package org.framestudy.spring_mybatis.relationmag.dao;

import org.framestudy.spring_mybatis.relationmag.beans.Classes;

public interface IClassDao {
	public Classes getClassesWithStusByClassId(int id);
}
