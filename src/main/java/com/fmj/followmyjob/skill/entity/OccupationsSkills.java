package com.fmj.followmyjob.skill.entity;

import com.fmj.followmyjob.occupation.entity.Occupation;
import com.fmj.followmyjob.skill.entity.enums.LevelSkill;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Entity( name = "occupations_skills" )
@Table( name = "occupations_skills" )
public class OccupationsSkills {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated( EnumType.STRING )
    private LevelSkill level;

    @ManyToOne(
        targetEntity = Occupation.class
    )
    @JoinColumn(
        name = "occupation_id",
        referencedColumnName = "id"
    )
    private Occupation occupation;

    @ManyToOne(
        targetEntity = Skill.class
    )
    @JoinColumn(
        name = "skill_id",
        referencedColumnName = "id"
    )
    private Skill skill;
}
