package com.fmj.followmyjob.profile.entity;

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
@Entity( name = "profile" )
@Table( name = "profile" )
public class Profile {

    @Id
    private UUID id;

    @Column(
        name = "name",
        nullable = false,
        unique = true
    )
    private String name;

    @Column(
        name = "profession",
        nullable = false
    )
    private String profession;
}
