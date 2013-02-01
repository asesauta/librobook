package com.asesauta.lb.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Authors")
public class Author {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;

	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
}