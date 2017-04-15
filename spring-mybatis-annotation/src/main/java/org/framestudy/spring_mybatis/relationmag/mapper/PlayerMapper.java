package org.framestudy.spring_mybatis.relationmag.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.framestudy.spring_mybatis.relationmag.beans.Game;
import org.framestudy.spring_mybatis.relationmag.beans.Player;

public interface PlayerMapper {
	
	@Select(value="select id as id,player_name as pName from t_player where id = #{id}")
	@ResultType(Player.class)
	public Player findPlayerById(int id);	//根据ID查询玩家
	
	
//	像这种比较复杂，需要循环添加的方法，就让它留在xml配置文件中吧！！！
	public int playerChoiceGames(@Param("player")Player player, @Param("games")List<Game> games);	//玩家选择多个游戏
	
	
	@Select(value="select * from t_player where player_name like CONCAT(#{name},'%')")
	@Results({
		@Result(id=true,property="id",column="id",javaType=Integer.class),
		@Result(property="pName",column="player_name",javaType=String.class),
		@Result(property="games",javaType=List.class,column="id",many=@Many(fetchType=FetchType.LAZY,select=
		"org.framestudy.spring_mybatis.relationmag.mapper.GameMapper.getGamesByPlayerId"))		
	})
	public List<Player> getPlayerWithGamesByPlayerName(@Param("name")String name);
	
	
	public Player findPlayerWithGamesByPlayerId(int id);
	
}
