/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karuna;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author riyak
 */
@Entity
@Table(name = "SHEDULEDOC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sheduledoc.findAll", query = "SELECT s FROM Sheduledoc s"),
    @NamedQuery(name = "Sheduledoc.findById", query = "SELECT s FROM Sheduledoc s WHERE s.id = :id"),
    @NamedQuery(name = "Sheduledoc.findByDay", query = "SELECT s FROM Sheduledoc s WHERE s.day = :day"),
    @NamedQuery(name = "Sheduledoc.findByName", query = "SELECT s FROM Sheduledoc s WHERE s.name = :name"),
    @NamedQuery(name = "Sheduledoc.findByLocation", query = "SELECT s FROM Sheduledoc s WHERE s.location = :location"),
    @NamedQuery(name = "Sheduledoc.findByTime", query = "SELECT s FROM Sheduledoc s WHERE s.time = :time"),
    @NamedQuery(name = "Sheduledoc.findByPatients", query = "SELECT s FROM Sheduledoc s WHERE s.patients = :patients")})
public class Sheduledoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 30)
    @Column(name = "DAY")
    private String day;
    @Size(max = 30)
    @Column(name = "NAME")
    private String name;
    @Size(max = 30)
    @Column(name = "LOCATION")
    private String location;
    @Size(max = 50)
    @Column(name = "TIME")
    private String time;
    @Column(name = "PATIENTS")
    private Integer patients;

    public Sheduledoc() {
    }

    public Sheduledoc(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getPatients() {
        return patients;
    }

    public void setPatients(Integer patients) {
        this.patients = patients;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sheduledoc)) {
            return false;
        }
        Sheduledoc other = (Sheduledoc) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.karuna.Sheduledoc[ id=" + id + " ]";
    }
    
}
