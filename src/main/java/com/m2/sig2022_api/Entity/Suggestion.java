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

    double coordonnes_x;
    double coordonnes_y;

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

    public double getCoordonnes_x() {
        return coordonnes_x;
    }

    public void setCoordonnes_x(double coordonnes_x) {
        this.coordonnes_x = coordonnes_x;
    }

    public double getCoordonnes_y() {
        return coordonnes_y;
    }

    public void setCoordonnes_y(double coordonnes_y) {
        this.coordonnes_y = coordonnes_y;
    }

    public Suggestion(String type, double coordonnes_x, double coordonnes_y) {
        this.type = type;
        this.coordonnes_x = coordonnes_x;
        this.coordonnes_y = coordonnes_y;
    }

}
