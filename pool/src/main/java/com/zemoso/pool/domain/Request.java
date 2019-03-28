package com.zemoso.pool.domain;

import javax.persistence.*;
import java.time.Duration;
import java.util.Date;

@Entity
@Table(name= "request")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer groupId;

    @Column(nullable=false)
    private Integer groupStrength;

    @Basic(optional = false)
    @Column(name = "LastTouched", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStampRequested;

    @Column(nullable = false)
    private Duration duration;

    @Column(nullable = false)
    private String statusOfBooking;

}
