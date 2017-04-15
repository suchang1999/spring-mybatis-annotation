package org.framestudy.spring_mybatis.relationmag.beans;

import java.io.Serializable;

public class Wife implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7519963017106072112L;
	
	private int id;
	private String name;
	private HusBand hus;
	
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
	public HusBand getHus() {
		return hus;
	}
	public void setHus(HusBand hus) {
		this.hus = hus;
	}
	public Wife() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Wife(int id, String name, HusBand hus) {
		super();
		this.id = id;
		this.name = name;
		this.hus = hus;
	}
	@Override
	public String toString() {
		return "Wife [id=" + id + ", name=" + name + "]";
	}
	
}
