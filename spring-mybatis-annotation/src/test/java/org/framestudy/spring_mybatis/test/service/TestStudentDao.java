package org.framestudy.spring_mybatis.test.service;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Students;
import org.framestudy.spring_mybatis.relationmag.dao.IStudentDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)	//使用JUnit测试的时候，启动Spring容器
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestStudentDao {
	
	@Resource
	private IStudentDao studentDaoImpl;
	
	@Test
	public void testGetStudentWithClassByStudentId(){
		Students student = studentDaoImpl.getStudentWithClassByStudentId(3);
		System.out.println(student.getName());
		System.out.println(student.getCla().getName());
	}
	
	
}
