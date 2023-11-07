package com.fmj.followmyjob.network.entity;

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
@Entity( name = "network" )
@Table( name = "network" )
public class Network {

    @Id
    private UUID id;

    @Column(
        name = "name",
        nullable = false
    )
    private String name;

    @Column(
        name = "url",
        nullable = false,
        unique = true
    )
    private String url;
}
