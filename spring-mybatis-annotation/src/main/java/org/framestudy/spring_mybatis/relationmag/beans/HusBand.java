package org.framestudy.spring_mybatis.relationmag.beans;

import java.io.Serializable;

public class HusBand implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1819824856335214068L;
	
	private int id;
	private String name;
	private Wife wife;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Wife getWife() {
		return wife;
	}
	public void setWife(Wife wife) {
		this.wife = wife;
	}
	public HusBand() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HusBand(int id, String name, Wife wife) {
		super();
		this.id = id;
		this.name = name;
		this.wife = wife;
	}
	@Override
	public String toString() {
		return "HusBand [id=" + id + ", name=" + name + ", wife=" + wife + "]";
	}
	
	
}
