package br.com.unip.hotelapp.model;

import java.math.BigInteger;

public class Client {

    private String name;
    private BigInteger telephone;
    private String nationality;
    private String address;
    private String gender;
    private String birthday;
    private String document;
    private String arrival;
    private String exit;
    private Integer idRoom;

    public Client(String name, BigInteger telephone, String nationality, String address, String gender, String birthday, String document, String arrival, String exit, Integer idRoom) {
        this.name = name;
        this.telephone = telephone;
        this.nationality = nationality;
        this.address = address;
        this.gender = gender;
        this.birthday = birthday;
        this.document = document;
        this.arrival = arrival;
        this.exit = exit;
        this.idRoom = idRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getTelephone() {
        return telephone;
    }

    public void setTelephone(BigInteger telephone) {
        this.telephone = telephone;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getExit() {
        return exit;
    }

    public void setExit(String exit) {
        this.exit = exit;
    }

    public Integer getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(Integer idRoom) {
        this.idRoom = idRoom;
    }
}
