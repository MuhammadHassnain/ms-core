package com.hassnain.core.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public class AbstractTimeStampEntity {


    @Column(name = "CREATED_BY", nullable = false)
    private String createdBy;
    @Column(name = "UPDATED_BY", nullable = false)
    private String updatedBy;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_BY", nullable = false)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    @Column(name = "UPDATED_BY", nullable = false)
    private Date updatedAt;



}
