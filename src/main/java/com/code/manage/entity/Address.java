package com.code.manage.entity;

import javax.persistence.*;

@Entity
@Table(name="address")
public class Address {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name="line")
    private String line;

    @Column(name="city")
    private String city;

    @Column(name="country")
    private String country;

    public Address() {
    }

    public Address(String line, String city, String country) {
        this.line = line;
        this.city = city;
        this.country = country;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Address [id=" + id + ", line=" + line + ", city=" + city + ", country=" + country + "]";
    }

}


