package com.fmj.followmyjob.occupation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity( name = "users_occupations" )
@Table( name = "users_occupations" )
public class UsersOccupations {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(
        name = "years_experience",
        nullable = false
    )
    private Integer yearsExperience;

    @Column(
        name = "months_experience",
        nullable = false
    )
    private Integer monthsExperience;
}
