package com.asesauta.lb.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="works")
public class Work {

	@Id
	@GeneratedValue
	private Integer id;
	private String title;
	private String lang;
	private String originalLang;
	private Author author;
	
	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	public String getLang() { return lang; }
	public void setLang(String lang) { this.lang = lang; }
	public String getOriginalLang() { return originalLang; }
	public void setOriginalLang(String originalLang) { this.originalLang = originalLang; }
	public Author getAuthor() { return author; }
	public void setAuthor(Author author) { this.author = author; }
}
