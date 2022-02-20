package com.soj.polymorphism.runtime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Employee {
    static final Logger logger= LogManager.getLogger(Employee.class.getName());
    private  String name;
    private String address;


    public Employee(String name, String address) {
        this.name = name;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String mailCheck(){
        return "Mailing a check to "+this.name + " "+this.address;
    }
    public String toString(){
        return name +" "+address;
    }
}
