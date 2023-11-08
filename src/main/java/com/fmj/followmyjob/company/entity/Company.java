package com.fmj.followmyjob.company.entity;

import java.util.List;
import java.util.UUID;

import com.fmj.followmyjob.network.entity.Network;
import com.fmj.followmyjob.vacancy.entity.Vacancy;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
@Entity( name = "company" )
@Table( name = "company" )
public class Company {

    @Id
    private UUID id;

    @Column(
        name = "name",
        nullable = false
    )
    private String name;

    @OneToMany(
        targetEntity = Network.class,
        cascade = CascadeType.ALL,
        fetch = FetchType.LAZY,
        mappedBy = "company"
    )
    private List<Network> networks;

    @OneToMany(
        targetEntity = Vacancy.class,
        fetch = FetchType.LAZY,
        mappedBy = "company"
    )
    private List<Vacancy> vacancies;
}
