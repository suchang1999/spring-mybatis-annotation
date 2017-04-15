package org.framestudy.spring_mybatis.test.service;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.HusBand;
import org.framestudy.spring_mybatis.relationmag.beans.Wife;
import org.framestudy.spring_mybatis.relationmag.dao.IHusbandDao;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)	//使用JUnit测试的时候，启动Spring容器
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestHusbandDao {

	@Resource
	private IHusbandDao husbandDaoImpl;
	
	@Ignore
	public void testMarry(){
		Wife wife = new Wife(1, "金有强", null);
		HusBand hus = new HusBand(1, "彭鹏飞", wife);
		husbandDaoImpl.marry(hus);
		
	}
	
	@Ignore
	public void testGetHusbandWithWifeByHusbandId(){
		HusBand hus = husbandDaoImpl.getHusbandWithWifeByHusbandId(9);
		System.out.println(hus);
	}
	
	@Test
	public void testDeleteHusbandWithWifeByHusbandId(){
		husbandDaoImpl.deleteHusbandWithWifeByHusbandId(8);
	}
	
}
