package com.asesauta.lb.data;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Authors")
public class Author {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String slug;
	
	@ManyToMany
	private Set<Author> authors;

	public Set<Author> getAuthors() { return authors; }
	public void setAuthors(Set<Author> authors) { this.authors = authors; }
	public String getSlug() { return slug; }
	public void setSlug(String slug) { this.slug = slug; }
	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
}
