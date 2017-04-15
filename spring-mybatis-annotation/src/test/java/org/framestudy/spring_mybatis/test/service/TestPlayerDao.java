package org.framestudy.spring_mybatis.test.service;

import java.util.List;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Game;
import org.framestudy.spring_mybatis.relationmag.beans.Player;
import org.framestudy.spring_mybatis.relationmag.dao.IGameDao;
import org.framestudy.spring_mybatis.relationmag.dao.IPlayerDao;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)	//使用JUnit测试的时候，启动Spring容器
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestPlayerDao {
	
	@Resource
	private IPlayerDao playerDaoImpl;
	@Resource
	private IGameDao gameDaoImpl;
	
	@Ignore
	public void testFindPlayerById(){
		Player player = playerDaoImpl.findPlayerById(2);
		System.out.println(player.getpName());
	}
	
	@Ignore
	public void testPlayerChoiceGames(){
		Player player = playerDaoImpl.findPlayerById(2);
		System.out.println(player.getpName());
		
		List<Game> games = gameDaoImpl.findAllGames();
		System.out.println("游戏一共有多少："+games.size());
		
		playerDaoImpl.playerChoiceGames(player, games);
		
	}
	
	@Test
	public void testGetPlayerWithGamesByPlayerName(){
		List<Player> players = playerDaoImpl.getPlayerWithGamesByPlayerName("小");
		for(Player player:players){
			System.out.println(player.getpName());
			System.out.println(player.getGames());
		}
	}
}
