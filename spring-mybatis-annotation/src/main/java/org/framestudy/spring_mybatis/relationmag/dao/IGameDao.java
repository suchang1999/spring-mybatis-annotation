package org.framestudy.spring_mybatis.relationmag.dao;

import java.util.List;

import org.framestudy.spring_mybatis.relationmag.beans.Game;

public interface IGameDao {
	public List<Game> findAllGames();	//查询所有的游戏
	
	public Game findGamesWithPlayerByGameId(int id);
}
