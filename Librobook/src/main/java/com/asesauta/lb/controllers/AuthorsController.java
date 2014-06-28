package com.asesauta.lb.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.asesauta.lb.data.Author;
import com.asesauta.lb.services.AuthorsService;

@Controller
public class AuthorsController {
	private static final Logger logger = LoggerFactory.getLogger(AuthorsController.class);

	@Resource
	AuthorsService svc;

	@RequestMapping(value = "/authors", method = RequestMethod.GET)
	public String list(Model model) {
		logger.debug("all authors");
		List<Author> authors = svc.getAllAuthors();
		model.addAttribute("authors", authors);
		return "authors";
	}	
}
