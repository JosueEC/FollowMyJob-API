package com.fmj.followmyjob.user.entity;

import java.util.UUID;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table( name = "users" )
public class User {
	@Id
	@Column( name = "id" )
	private UUID id;
	
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
}
