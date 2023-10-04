package com.example.MinorProject1.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.MinorProject1.models.Student;
import com.example.MinorProject1.requestDto.StudentCreateRequest;
import com.example.MinorProject1.service.StudentServiceInterf;

@RestController
public class StudentController {
	
	@Autowired
	StudentServiceInterf studentServiceInterf;
	
	@PostMapping("/student")
	public ResponseEntity saveStudent(@Valid @RequestBody StudentCreateRequest studentCreateRequest) {
		return new ResponseEntity(studentServiceInterf.save(studentCreateRequest),HttpStatus.CREATED);
	}


}
