package com.alexkolson.wtf.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
public class Parent extends GrandParent {
    @ManyToOne(fetch = FetchType.LAZY)
    private CrazyUncle uncle;

    private boolean isResponsible;

    public boolean isResponsible() {
        return isResponsible;
    }

    public void setResponsible(boolean responsible) {
        isResponsible = responsible;
    }

    public CrazyUncle getUncle() {
        return uncle;
    }

    public void setUncle(CrazyUncle uncle) {
        this.uncle = uncle;
    }
}
