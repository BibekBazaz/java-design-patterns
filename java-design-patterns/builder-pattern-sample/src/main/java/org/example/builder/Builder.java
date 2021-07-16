package org.example.builder;

import org.example.components.Person;
import org.example.components.Relative;

import java.util.ArrayList;

public interface Builder {
    public void setRequestId(String requestId);
    public void setPersonInfo(Person personInfo);
    public void setRelatives(ArrayList<Relative> relatives);

}
