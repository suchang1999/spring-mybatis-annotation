package org.framestudy.spring_mybatis.relationmag.beans;

import java.io.Serializable;
import java.util.List;

public class Player implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3231125428347791000L;
	
	private int id;
	private String pName;
	private List<Game> games;
	
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(int id, String pName, List<Game> games) {
		super();
		this.id = id;
		this.pName = pName;
		this.games = games;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", pName=" + pName + ", games=" + games + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public List<Game> getGames() {
		return games;
	}
	public void setGames(List<Game> games) {
		this.games = games;
	}
	
	
	
}
