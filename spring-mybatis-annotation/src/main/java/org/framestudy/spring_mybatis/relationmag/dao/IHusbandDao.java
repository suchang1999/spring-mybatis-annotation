package org.framestudy.spring_mybatis.relationmag.dao;

import org.framestudy.spring_mybatis.relationmag.beans.HusBand;

public interface IHusbandDao {
	public int marry(HusBand hus);	//男女结婚
	public HusBand getHusbandWithWifeByHusbandId(int id);
	public int deleteHusbandWithWifeByHusbandId(int id);
}
