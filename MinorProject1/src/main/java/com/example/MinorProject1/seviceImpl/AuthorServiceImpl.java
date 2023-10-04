package com.example.MinorProject1.seviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MinorProject1.models.Author;
import com.example.MinorProject1.repository.AuthorRepositoryInterf;
import com.example.MinorProject1.service.AuthorServiceInterf;

@Service
public class AuthorServiceImpl implements AuthorServiceInterf {
	
	@Autowired
	AuthorRepositoryInterf authorRepositoryInterf;
	
	public Author findByEmail(String email) {
		return authorRepositoryInterf.findByEmail(email);
	}

	@Override
	public Author createAuthor(Author author) {
		return authorRepositoryInterf.save(author);
	}

}
