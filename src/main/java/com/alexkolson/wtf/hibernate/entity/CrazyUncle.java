package com.alexkolson.wtf.hibernate.entity;

import javax.persistence.Entity;

@Entity
public class CrazyUncle extends GrandParent {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
