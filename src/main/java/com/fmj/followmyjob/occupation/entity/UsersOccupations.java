package com.fmj.followmyjob.occupation.entity;

import com.fmj.followmyjob.user.entity.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    @ManyToOne(
        targetEntity = User.class
    )
    @JoinColumn(
        name = "user_id",
        referencedColumnName = "id"
    )
    private User user;

    @ManyToOne(
        targetEntity = Occupation.class
    )
    @JoinColumn(
        name = "occupation_id",
        referencedColumnName = "id"
    )
    private Occupation occupation;
}
