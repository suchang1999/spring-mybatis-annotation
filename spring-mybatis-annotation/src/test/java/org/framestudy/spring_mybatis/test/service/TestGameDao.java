package org.framestudy.spring_mybatis.test.service;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Game;
import org.framestudy.spring_mybatis.relationmag.dao.IGameDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)	//使用JUnit测试的时候，启动Spring容器
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestGameDao {
	
	@Resource
	private IGameDao gameDaoImpl;

	
	@Test
	public void testFindGamesWithPlayerByGameId(){
		Game game = gameDaoImpl.findGamesWithPlayerByGameId(1);
		System.out.println(game.getgName());
		System.out.println(game.getPlayers());
	}
}
