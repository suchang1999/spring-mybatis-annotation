package org.framestudy.spring_mybatis.relationmag.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.framestudy.spring_mybatis.relationmag.beans.Game;
import org.framestudy.spring_mybatis.relationmag.beans.Player;

public interface GameMapper {
	
	@Select(value="select id as id, game_name as gName from t_game")
	@ResultType(Game.class)	//注意：这里返回一个Game类型的集合，但是ResultType不是写成List！！！！
	public List<Game> findAllGames();	//查询所有的游戏
	
	
	@Select(value="select * from t_game where id = #{id}")
	@Results({
		@Result(id=true,property="gId",column="id",javaType=Integer.class),
		@Result(property="gName",column="game_name",javaType=String.class),
		@Result(property="players",javaType=List.class,column="id",many=@Many(fetchType=FetchType.LAZY,select=
		"findPlayerByGameId"))
	})
	public Game findGamesWithPlayerByGameId(int id);
	
	
	//left join 和 right join 不能随便乱写，思考一下到底该怎么用？？
	@Select(value="select p.player_name as pName from t_player p join t_player_game pg  "
			+ "join t_game g on p.id = pg.fk_player_game and g.id = pg.fk_game_player  "
			+ "where fk_game_player = #{id}")
	@ResultType(Player.class)
	public List<Player> findPlayerByGameId(int id);
}
