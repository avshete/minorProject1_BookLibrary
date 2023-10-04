package com.example.MinorProject1.responseDto;

import java.util.Date;

import com.example.MinorProject1.enums.Genre;
import com.example.MinorProject1.models.Author;
import com.example.MinorProject1.models.Student;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class BookSearchResponse {
	
	private int id;
	private String name;
	private int cost;
	private Genre genre;
	
	@JsonIgnoreProperties({"bookList"})
	private Author author;
	
	@JsonIgnoreProperties({"bookList"})
	private Student student;
	
//	private List<Transaction> transactionList;
	
	private Date createdOn;
	private Date updatedOn;
	
	

}
