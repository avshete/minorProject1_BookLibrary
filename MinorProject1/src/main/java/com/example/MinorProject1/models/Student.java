package com.example.MinorProject1.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.apache.catalina.users.MemoryUser;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.example.MinorProject1.enums.AccountStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@Entity
@NoArgsConstructor
public class Student implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@Column(unique = true)
	private String email;
	
	@Column(unique = true)
	private String contact;
	
//	@Transient
	private String address;
	
	@Enumerated(value = EnumType.STRING)
	private AccountStatus accountStatus;
	
//	private static boolean flag;
	
	@OneToMany(mappedBy = "student")
	private List<Book> bookList;
	
	@OneToMany(mappedBy = "student")
	private List<Transaction> transactionList;

	
	@CreationTimestamp
	private Date createdOn;
	
	@UpdateTimestamp
	private Date updatedOn;

}
