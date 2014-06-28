package com.asesauta.lb.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asesauta.lb.dao.AuthorDao;
import com.asesauta.lb.data.Author;

@Service(value="authorsService")
@Transactional
public class AuthorsService {
	
	@Resource
	private AuthorDao authorDao;

	public void setAuthorDao(AuthorDao authorDao) {
		this.authorDao = authorDao;
	}

	public Author getAuthor(Integer id) {
		return authorDao.getAuthor(id);
	}
	
	public List<Author> getAllAuthors() {
		return authorDao.getAllAuthors();
	}
}
