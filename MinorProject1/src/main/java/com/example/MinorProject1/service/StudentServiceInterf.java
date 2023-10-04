package com.example.MinorProject1.service;

import java.util.Optional;

import com.example.MinorProject1.models.Student;
import com.example.MinorProject1.requestDto.StudentCreateRequest;

public interface StudentServiceInterf {

	Student save(StudentCreateRequest studentCreateRequest);
	
	Optional<Student> findById(int studentId);

}
