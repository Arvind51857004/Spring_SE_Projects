package com.hibernateapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "Movie_Name")
	private String name;
	@Column(name = "Actor_Name")
	private String actor;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(Integer id, String name, String actor) {
		super();
		this.id = id;
		this.name = name;
		this.actor = actor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

}
