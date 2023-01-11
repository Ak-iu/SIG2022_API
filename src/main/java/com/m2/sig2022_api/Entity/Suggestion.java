package com.m2.sig2022_api.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Suggestion {
    @Id
    @GeneratedValue
    int idSuggestion;

    String type;

    Double coordonnes_x;
    Double coordonnes_y;

    public Suggestion() {

    }

    public int getIdSuggestion() {
        return idSuggestion;
    }

    public void setIdSuggestion(int idSuggestion) {
        this.idSuggestion = idSuggestion;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getCoordonnes_x() {
        return coordonnes_x;
    }

    public void setCoordonnes_x(Double coordonnes_x) {
        this.coordonnes_x = coordonnes_x;
    }

    public Double getCoordonnes_y() {
        return coordonnes_y;
    }

    public void setCoordonnes_y(Double coordonnes_y) {
        this.coordonnes_y = coordonnes_y;
    }

    public Suggestion(String type, Double coordonnes_x,Double coordonnes_y) {
        this.type = type;
        this.coordonnes_x = coordonnes_x;
        this.coordonnes_y = coordonnes_y;
    }

}
