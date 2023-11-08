package com.fmj.followmyjob.color.entity;

import java.util.List;

import com.fmj.followmyjob.vacancy.entity.Vacancy;

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
@Entity( name = "color" )
@Table( name = "color" )
public class Color {

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
        targetEntity = Vacancy.class,
        fetch = FetchType.LAZY,
        mappedBy = "color"
    )
    private List<Vacancy> vacancies;
}
