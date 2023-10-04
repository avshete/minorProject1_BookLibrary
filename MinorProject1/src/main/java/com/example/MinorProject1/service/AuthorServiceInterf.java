package com.example.MinorProject1.service;

import com.example.MinorProject1.models.Author;

public interface AuthorServiceInterf {
	
	Author findByEmail(String email);

	Author createAuthor(Author author);

}