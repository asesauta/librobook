package com.asesauta.lb.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.asesauta.lb.data.Author;

@Repository
public class AuthorDao {
	
	@Resource
	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Author getAuthor(Integer id) {
    	Session session = sessionFactory.getCurrentSession();
    	return (Author) session.get(Author.class, id);
    }
    
    @SuppressWarnings("unchecked")
	public List<Author> getAllAuthors() {
    	Session session = sessionFactory.getCurrentSession();
    	Query query = session.createQuery("from Author");
    	return (List<Author>) query.list();
    }
    
    public void insert(Author author) {
    	Session session = sessionFactory.getCurrentSession();
    	session.save(author);
    }
}
