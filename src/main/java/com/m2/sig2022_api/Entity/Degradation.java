package com.m2.sig2022_api.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.GetMapping;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Degradation {
    @Id
    @GeneratedValue
    private int id;

    private String idEquipement;
    private String date;

    private String nature;

    public Degradation(String idEquipement, String nature,String date) {
        this.idEquipement = idEquipement;
        this.nature = nature;
        this.date = date;
    }

    public Degradation() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdEquipement() {
        return idEquipement;
    }

    public void setIdEquipement(String idEquipement) {
        this.idEquipement = idEquipement;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }
}
