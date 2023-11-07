package com.fmj.followmyjob.company.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
}
