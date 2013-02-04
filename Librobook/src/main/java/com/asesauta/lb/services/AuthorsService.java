package com.asesauta.lb.services;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asesauta.lb.dao.AuthorDao;
import com.asesauta.lb.data.Author;

@Service(value="authorsService")
public class AuthorsService {
	
	@Resource
	private AuthorDao authorDao;

	public void setAuthorDao(AuthorDao authorDao) {
		this.authorDao = authorDao;
	}

	@Transactional
	public Author getAuthor(Integer id) {
		return authorDao.getAuthor(id);
	}
}
