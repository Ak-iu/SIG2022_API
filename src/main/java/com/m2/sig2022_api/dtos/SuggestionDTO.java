package com.m2.sig2022_api.dtos;

public class SuggestionDTO {
    private String type;
    private double coord_x;
    private double coord_y;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCoord_x() {
        return coord_x;
    }

    public void setCoord_x(double coord_x) {
        this.coord_x = coord_x;
    }

    public double getCoord_y() {
        return coord_y;
    }

    public void setCoord_y(double coord_y) {
        this.coord_y = coord_y;
    }
}
