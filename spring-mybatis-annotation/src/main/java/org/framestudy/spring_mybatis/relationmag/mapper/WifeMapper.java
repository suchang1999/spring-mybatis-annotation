package org.framestudy.spring_mybatis.relationmag.mapper;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.framestudy.spring_mybatis.relationmag.beans.HusBand;
import org.framestudy.spring_mybatis.relationmag.beans.Wife;

public interface WifeMapper {
	
	@Select(value="select * from t_wife where id = #{id}")
	@Results({
		@Result(id=true,property="id",column="id",javaType=Integer.class),
		@Result(property="name",column="wife_name",javaType=String.class),
		@Result(property="hus",javaType=HusBand.class,column="fk_hus_id",one=@One(fetchType=FetchType.LAZY,select=
		"org.framestudy.spring_mybatis.relationmag.mapper.HusbandMapper.getHusbandByFkHusId"))
	})
	public Wife getWifeWithHusbandByWifeId(int id);	//根据妻子id查询妻子与丈夫
}
