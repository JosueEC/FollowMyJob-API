package com.fmj.followmyjob.user.entity;

import java.util.List;
import java.util.UUID;

import com.fmj.followmyjob.occupation.entity.UsersOccupations;
import com.fmj.followmyjob.profile.entity.Profile;
import com.fmj.followmyjob.vacancy.entity.Vacancy;

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

	@OneToOne(
		targetEntity = Profile.class,
		cascade = CascadeType.ALL,
		fetch = FetchType.LAZY
	)
	@JoinColumn(
		name = "profile_id",
		referencedColumnName = "id"
	)
	private Profile profile;

	@ManyToMany(
		targetEntity = Vacancy.class,
		fetch = FetchType.LAZY
	)
	@JoinTable(
		name = "users_vacancies",
		joinColumns = @JoinColumn(
			name = "user_id",
			referencedColumnName = "id"
		),
		inverseJoinColumns = @JoinColumn(
			name = "vacancy_id",
			referencedColumnName = "id"
		)
	)
	private List<Vacancy> vacancies;

	@OneToMany(
		targetEntity = UsersOccupations.class,
		cascade = CascadeType.ALL,
		fetch = FetchType.LAZY,
		mappedBy = "user"
	)
	private List<UsersOccupations> usersOccupations;
}
