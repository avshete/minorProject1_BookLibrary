package com.example.MinorProject1.seviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MinorProject1.models.Student;
import com.example.MinorProject1.repository.StudentRepositoryInterf;
import com.example.MinorProject1.requestDto.StudentCreateRequest;
import com.example.MinorProject1.service.StudentServiceInterf;

@Service
public class StudentServiceImpl implements StudentServiceInterf{
	
	@Autowired
	StudentRepositoryInterf studentRepositoryInterf;


	@Override
	public Student save(StudentCreateRequest studentCreateRequest) {
		return studentRepositoryInterf.save(studentCreateRequest.toStudent());
	}

	@Override
	public Optional<Student> findById(int studentId) {
		return studentRepositoryInterf.findById(studentId);
	}


}
