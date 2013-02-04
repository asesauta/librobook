package com.asesauta.lb.dao;

import javax.annotation.Resource;

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
}
