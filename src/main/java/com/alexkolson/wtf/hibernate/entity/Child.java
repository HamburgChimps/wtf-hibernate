package com.alexkolson.wtf.hibernate.entity;

import javax.persistence.Entity;

@Entity
public class Child extends Parent {
    private Boolean troublemaker;


    public Boolean getTroublemaker() {
        return troublemaker;
    }

    public void setTroublemaker(Boolean troublemaker) {
        this.troublemaker = troublemaker;
    }
}
