package com.asesauta.lb.data;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
	
	@ManyToMany
	private Set<Author> authors;
	
	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	public String getLang() { return lang; }
	public void setLang(String lang) { this.lang = lang; }
	public String getOriginalLang() { return originalLang; }
	public void setOriginalLang(String originalLang) { this.originalLang = originalLang; }
	public Set<Author> getAuthors() { return authors; }
	public void setAuthors(Set<Author> authors) { this.authors = authors; }
}
