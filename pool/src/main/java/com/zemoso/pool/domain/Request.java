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

//    @Basic(optional = false)
//    @Column(name = "LastTouched", insertable = false, updatable = false)
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date timeStampRequested;

    @Column(nullable = false)
    private Integer duration;

    @Column(nullable = false)
    private String statusOfBooking;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getGroupStrength() {
        return groupStrength;
    }

    public void setGroupStrength(Integer groupStrength) {
        this.groupStrength = groupStrength;
    }

//    public Date getTimeStampRequested() {
//        return timeStampRequested;
//    }
//
//    public void setTimeStampRequested(Date timeStampRequested) {
//        this.timeStampRequested = timeStampRequested;
//    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getStatusOfBooking() {
        return statusOfBooking;
    }

    public void setStatusOfBooking(String statusOfBooking) {
        this.statusOfBooking = statusOfBooking;
    }
}
