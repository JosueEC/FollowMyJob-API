package com.fmj.followmyjob.vacancy.entity;

import java.util.UUID;

import com.fmj.followmyjob.color.entity.Color;
import com.fmj.followmyjob.company.entity.Company;
import com.fmj.followmyjob.job.entity.Job;
import com.fmj.followmyjob.location.entity.Location;
import com.fmj.followmyjob.vacancy.entity.enums.JobStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    @ManyToOne(
        targetEntity = Company.class
    )
    @JoinColumn(
        name = "company_id",
        referencedColumnName = "id"
    )
    private Company company;

    @ManyToOne(
        targetEntity = Color.class
    )
    @JoinColumn(
        name = "color_id",
        referencedColumnName = "id"
    )
    private Color color;

    @ManyToOne(
        targetEntity = Location.class
    )
    @JoinColumn(
        name = "location_id",
        referencedColumnName = "id"
    )
    private Location location;

    @ManyToOne(
        targetEntity = Job.class
    )
    @JoinColumn(
        name = "job_id",
        referencedColumnName = "id"
    )
    private Job job;
}
