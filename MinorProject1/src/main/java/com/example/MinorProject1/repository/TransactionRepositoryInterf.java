package com.example.MinorProject1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MinorProject1.enums.TransactionType;
import com.example.MinorProject1.models.Transaction;

public interface TransactionRepositoryInterf extends JpaRepository<Transaction, Integer>
{
	Transaction findTopByBookAndStudentAndTransactionTypeOrderByIdDesc(int bookId, int studentId,
			TransactionType transactionType);
}