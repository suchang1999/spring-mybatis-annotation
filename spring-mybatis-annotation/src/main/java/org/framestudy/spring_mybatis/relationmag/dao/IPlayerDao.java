package org.framestudy.spring_mybatis.relationmag.dao;

import java.util.List;

import org.framestudy.spring_mybatis.relationmag.beans.Game;
import org.framestudy.spring_mybatis.relationmag.beans.Player;

public interface IPlayerDao {
	public Player findPlayerById(int id);	//根据ID查询玩家
	public int playerChoiceGames(Player player,List<Game> games);	//玩家选择多个游戏	
	public List<Player> getPlayerWithGamesByPlayerName(String name);	//根据玩家名字查找玩家和游戏
	
	public Player findPlayerWithGamesByPlayerId(int id);
}
