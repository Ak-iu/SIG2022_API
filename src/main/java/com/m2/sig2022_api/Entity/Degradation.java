package com.m2.sig2022_api.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.GetMapping;

import javax.xml.crypto.Data;
import java.util.Date;

@Entity
public class Degradation {
    @Id
    @GeneratedValue
    private int id;

    private Date date;

    private String nature;

    public Degradation(Date date, String nature) {
        this.date = date;
        this.nature = nature;
    }

    public Degradation() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }
}
