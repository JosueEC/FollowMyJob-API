package com.fmj.followmyjob.profile.entity;

import java.util.List;
import java.util.UUID;

import com.fmj.followmyjob.network.entity.Network;

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

    @OneToMany(
        targetEntity = Network.class,
        cascade = CascadeType.ALL,
        fetch = FetchType.LAZY,
        mappedBy = "profile"
    )
    private List<Network> networks;
}
