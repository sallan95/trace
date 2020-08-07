package com.rubix.trace.Entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Event")
public class Event {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer risk_id;
    private Date event_date;
    
    @Override
    public String toString() {
        return "Household{" +
                ", risk_id='" + risk_id + '\'' +
                ", event_date=" + event_date +
                '}';
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRisk_id() {
		return risk_id;
	}

	public void setRisk_id(Integer risk_id) {
		this.risk_id = risk_id;
	}

	public Date getEvent_date() {
		return event_date;
	}

	public void setEvent_date(Date event_date) {
		this.event_date = event_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
}