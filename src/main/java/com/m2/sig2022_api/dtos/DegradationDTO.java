package com.m2.sig2022_api.dtos;

import java.util.Date;

public class DegradationDTO {
    private String nature;
    private String date;
    private String id_equipement;


    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId_equipement() {
        return id_equipement;
    }

    public void setId_equipement(String id_equipement) {
        this.id_equipement = id_equipement;
    }
}
