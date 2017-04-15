package org.framestudy.spring_mybatis.test.service;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Classes;
import org.framestudy.spring_mybatis.relationmag.dao.IClassDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)	//使用JUnit测试的时候，启动Spring容器
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestClassDao {
	
	@Resource
	private IClassDao classDaoImpl;
	
	@Test
	public void testGetClassesWithStusByClassId(){
		Classes clas = classDaoImpl.getClassesWithStusByClassId(1);
		
		System.out.println(clas.getName());
		System.out.println(clas.getStus());
	}
}
