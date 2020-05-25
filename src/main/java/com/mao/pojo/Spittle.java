package com.mao.pojo;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;

public class Spittle  {
    private int id;
    private String message;
    private Date createData;
    private double longitude;
    private double latitude;

    public Spittle() {
    }

    public Spittle(int id, String message, Date createData, double longitude, double latitude) {
        this.id = id;
        this.message = message;
        this.createData = createData;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Spittle(int id, Date date) {
        this.id = id;
        this.createData = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCreateData(Date createData) {
        this.createData = createData;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getMessage() {
        return message;
    }

    public Date getCreateData() {
        return createData;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    @Override
    public boolean equals(Object o) {
       return EqualsBuilder.reflectionEquals(this,o,"id","createDate");
    }

    @Override
    public int hashCode() {
       return HashCodeBuilder.reflectionHashCode(this,"id","createDate");
    }
}
