package com.soj.polymorphism.runtime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Salary extends Employee {
    static final Logger logger= LogManager.getLogger(Salary.class.getName());
    private double salaryAmt;

    public Salary(String name, String address,  double salaryAmt) {
        super(name, address);
        this.salaryAmt = salaryAmt;
    }

    public double getSalaryAmt() {
        return salaryAmt;
    }

    public void setSalary(double newSalary) {
        if(newSalary>=0.0){
            salaryAmt =newSalary;
        }
    }

    @Override
    public String mailCheck(){
        logger.debug("Within mailCheck of Salary Class ");
        return "Mailing a check to "+getName()+" with salary "+salaryAmt;
    }

    public double computePay(){
        logger.debug("Computing salary pay for {}" ,getName());
        return salaryAmt/52;
    }

}
