package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import lombok.Data;
@Data
@Entity
@DynamicUpdate 
@EnableAutoConfiguration
public class Etudiant {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String fullName;
	@Column(unique=true, nullable=false)
	private String cin;
	
	
	
}
