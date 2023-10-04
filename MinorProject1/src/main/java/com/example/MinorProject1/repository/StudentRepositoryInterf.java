package com.example.MinorProject1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MinorProject1.models.Student;

public interface StudentRepositoryInterf extends JpaRepository<Student, Integer>{

}