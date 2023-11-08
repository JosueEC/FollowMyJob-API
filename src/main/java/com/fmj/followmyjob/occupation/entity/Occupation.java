package com.fmj.followmyjob.occupation.entity;

import java.util.List;

import com.fmj.followmyjob.skill.entity.OccupationsSkills;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity( name = "occupation" )
@Table( name = "occupation" )
public class Occupation {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(
        name = "name",
        nullable = false,
        unique = true
    )
    private String name;

    @OneToMany(
        targetEntity = UsersOccupations.class,
        cascade = CascadeType.ALL,
        fetch = FetchType.LAZY,
        mappedBy = "occupation"
    )
    private List<UsersOccupations> usersOccupations;

    @OneToMany(
        targetEntity = OccupationsSkills.class,
        cascade = CascadeType.ALL,
        fetch = FetchType.LAZY,
        mappedBy = "occupation"
    )
    private List<OccupationsSkills> occupationsSkills;
}
