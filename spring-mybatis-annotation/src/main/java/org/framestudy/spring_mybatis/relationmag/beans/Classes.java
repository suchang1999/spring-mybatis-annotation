package org.framestudy.spring_mybatis.relationmag.beans;

import java.io.Serializable;
import java.util.List;

public class Classes implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 678703713974776855L;
	
	private int id;
	private String name;
	private List<Students> stus;
	
	public Classes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Classes(int id, String name, List<Students> stus) {
		super();
		this.id = id;
		this.name = name;
		this.stus = stus;
	}
	@Override
	public String toString() {
		return "Classes [id=" + id + ", name=" + name + ", stus=" + stus + "]";
	}
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
	public List<Students> getStus() {
		return stus;
	}
	public void setStus(List<Students> stus) {
		this.stus = stus;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
