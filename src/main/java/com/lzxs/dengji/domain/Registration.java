package com.lzxs.dengji.domain;

import java.io.Serializable;

public class Registration implements Serializable {
    private Integer id;

    private String username;

    private String temperature;

    private String origin;

    private String destination;

    private String idcard;

    private String transpartation;

    private String rigisterdata;

    private String officer;

    private String carNumber;

    private String visitor;

    private String visitorPhone;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature == null ? null : temperature.trim();
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getTranspartation() {
        return transpartation;
    }

    public void setTranspartation(String transpartation) {
        this.transpartation = transpartation == null ? null : transpartation.trim();
    }

    public String getRigisterdata() {
        return rigisterdata;
    }

    public void setRigisterdata(String rigisterdata) {
        this.rigisterdata = rigisterdata == null ? null : rigisterdata.trim();
    }

    public String getOfficer() {
        return officer;
    }

    public void setOfficer(String officer) {
        this.officer = officer == null ? null : officer.trim();
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber == null ? null : carNumber.trim();
    }

    public String getVisitor() {
        return visitor;
    }

    public void setVisitor(String visitor) {
        this.visitor = visitor == null ? null : visitor.trim();
    }

    public String getVisitorPhone() {
        return visitorPhone;
    }

    public void setVisitorPhone(String visitorPhone) {
        this.visitorPhone = visitorPhone == null ? null : visitorPhone.trim();
    }
}