package com.devsuperior.dspesquisa.dto;

import java.io.Serializable;
import java.time.Instant;

public class RecordInsertDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	
	private String name;
	private Integer age;
	//private Instant moment;

	


	public RecordInsertDTO() {
	}
	

	private Long gameId;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getGameId() {
		return gameId;
	}

	public void setGameId(Long gameId) {
		this.gameId = gameId;
	}
	
/*	
	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}*/
}
