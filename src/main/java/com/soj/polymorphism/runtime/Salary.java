package com.soj.polymorphism.runtime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Salary extends Employee {
    static final Logger logger= LogManager.getLogger(Salary.class.getName());
    private double salary;

    public Salary(String name, String address,  double salary) {
        super(name, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if(newSalary>=0.0){
            salary =newSalary;
        }
    }

    @Override
    public String mailCheck(){
        logger.debug("Within mailCheck of Salary Class ");
        return "Mailing a check to "+getName()+" with salary "+salary;
    }

    public double computePay(){
        logger.debug("Computing salary pay for {}" ,getName());
        return salary/52;
    }

}
