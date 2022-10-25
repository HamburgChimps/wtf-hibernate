package de.hamburgchimps.entity;

import javax.persistence.Entity;

@Entity
public class Child extends Parent {
    private Boolean isTroublemaker;


    public Boolean getIsTroublemaker() {
        return isTroublemaker;
    }

    public void setIsTroublemaker(Boolean troublemaker) {
        this.isTroublemaker = troublemaker;
    }
}
