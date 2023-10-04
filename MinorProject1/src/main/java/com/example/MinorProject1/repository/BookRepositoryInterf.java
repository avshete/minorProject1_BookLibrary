package com.example.MinorProject1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MinorProject1.enums.Genre;
import com.example.MinorProject1.models.Book;

public interface BookRepositoryInterf extends JpaRepository<Book, Integer>{
	
//	@Query("select b from Book b where name i like '%:name%'")
	
	List<Book> findByName(String name);
	
	List<Book> findByAuthor_name(String name);

	List<Book> findByGenre(Genre name);


}
