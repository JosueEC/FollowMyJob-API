package com.fmj.followmyjob.vacancy.entity;

import java.util.UUID;

import com.fmj.followmyjob.vacancy.entity.enums.JobStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity( name = "vacancy" )
@Table( name = "vacancy" )
public class Vacancy {

    @Id
    private UUID id;

    @Column(
        name = "post_url",
        nullable = true
    )
    private String postUrl;

    @Column(
        name = "salary",
        nullable = true
    )
    private String salary;

    @Column(
        name = "job_description",
        nullable = true
    )
    private String jobDescription;

    @Enumerated( EnumType.STRING )
    private JobStatus status;
}
