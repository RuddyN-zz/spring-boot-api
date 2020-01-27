package com.example.dao;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {

    @Id
    private float id;

    private String name;

    public User() {
    }

    public User(float id, String name) {
        this.id = id;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
