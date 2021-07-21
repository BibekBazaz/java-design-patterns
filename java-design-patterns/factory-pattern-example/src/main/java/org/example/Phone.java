package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {

    protected List<Specifications> specificationsList = new ArrayList<>();
    public Phone(){
        createPhone();
    }

    public abstract void createPhone();

    @Override
    public String toString() {
        return "Phone{" +
                "specificationsList=" + specificationsList.toString() +
                '}';
    }
}
