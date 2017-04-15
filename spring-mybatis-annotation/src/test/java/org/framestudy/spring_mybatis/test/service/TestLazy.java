package org.framestudy.spring_mybatis.test.service;

import org.apache.ibatis.session.SqlSession;
import org.framestudy.spring_mybatis.relationmag.beans.Wife;
import org.framestudy.spring_mybatis.relationmag.mapper.WifeMapper;
import org.framestudy.spring_mybatis.utils.SessionUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)	//使用JUnit测试的时候，启动Spring容器
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestLazy {
	@Test
	public void testLazy(){
		SqlSession session = SessionUtils.getSession();
		WifeMapper wm = session.getMapper(WifeMapper.class);
		Wife wife = wm.getWifeWithHusbandByWifeId(3);
		System.out.println(wife.getName());
		session.close();
		System.out.println(wife.getHus());
	}
}
