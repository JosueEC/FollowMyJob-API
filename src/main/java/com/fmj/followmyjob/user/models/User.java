package com.fmj.followmyjob.user.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table( name = "users" )
public class User {
	@Id
	@Column( name = "id" )
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	
	@Column(
			name = "email",
			nullable = false,
			unique = true
	)
	private String email;
	
	@Column(
			name = "password",
			nullable = false
	)
	private String password;
	
	public User() {}
	
	public User(Long id, String email, String password) {
		this.id = id;
		this.email = email;
		this.password = password;
	}
}
