package org.framestudy.spring_mybatis.relationmag.beans;

import java.io.Serializable;
import java.util.List;

public class Game implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3772203920534017392L;
	
	private int gId;
	private String gName;
	private List<Player> players;
	
	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Game(int gId, String gName, List<Player> players) {
		super();
		this.gId = gId;
		this.gName = gName;
		this.players = players;
	}
	@Override
	public String toString() {
		return "Game [gId=" + gId + ", gName=" + gName + ", players=" + players + "]";
	}
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
}
