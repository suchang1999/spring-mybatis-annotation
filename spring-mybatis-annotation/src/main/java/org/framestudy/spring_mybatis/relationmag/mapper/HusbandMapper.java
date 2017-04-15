package org.framestudy.spring_mybatis.relationmag.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.framestudy.spring_mybatis.relationmag.beans.HusBand;

public interface HusbandMapper {
	
	@Insert(value={"insert into t_hus (hus_name) values (#{hus.name});",
			"insert into t_wife (wife_name,fk_hus_id) values "
			+ "(#{hus.wife.name},(select id from t_hus where hus_name = #{hus.name}))"})
//	@Options() 可以设置每个标签中的属性
	public int marry(@Param("hus")HusBand hus);	//男女结婚
	
	
	@Select(value="select h.id as hID,h.hus_name as hName,w.id as wID,w.wife_name as wName "
			+ "from t_hus as h left join t_wife as w on h.id = w.fk_hus_id where h.id = #{id}")
//	@ResultMap("husMap")
	@Results({
		@Result(id=true,property="id",column="hID",javaType=Integer.class),
		@Result(property="name",column="hName",javaType=String.class),
		@Result(property="wife.id",column="wID",javaType=Integer.class),
		@Result(property="wife.name",column="wName",javaType=String.class)
	})
	public HusBand getHusbandWithWifeByHusbandId(int id);
	
	
	@Delete(value={
		"delete from t_wife where fk_hus_id = #{id};",
		"delete from t_hus where id = #{id}"
	})
	public int deleteHusbandWithWifeByHusbandId(int id);
	
	
	@Select(value="select id as id,hus_name as name from t_hus where id = #{id}")
	@ResultType(HusBand.class)
	public HusBand getHusbandByFkHusId(int id);
	
	
	
}
