package org.framestudy.spring_mybatis.relationmag.dao;

import org.framestudy.spring_mybatis.relationmag.beans.Wife;

public interface IWifeDao {
	public Wife getWifeWithHusbandByWifeId(int id);	//根据妻子id查询妻子与丈夫
}
