package org.framestudy.spring_mybatis.relationmag.beans;

import java.io.Serializable;

public class Students implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9015831257833397620L;
	
	private int id;
	private String name;
	private Classes cla;
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(int id, String name, Classes cla) {
		super();
		this.id = id;
		this.name = name;
		this.cla = cla;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", cla=" + cla + "]";
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
	public Classes getCla() {
		return cla;
	}
	public void setCla(Classes cla) {
		this.cla = cla;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
