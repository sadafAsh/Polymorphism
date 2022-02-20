package com.soj.polymorphism.runtime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryTest {

    @Test
    void testToGetSalary() {
        Salary salary=new Salary("Owais","India",36000);
        Assertions.assertEquals(36000,salary.getSalaryAmt());
    }

    @Test
    void testForMailCheck() {
        Salary salary=new Salary("Owais","India",36000);
        String result="Mailing a check to "+"Owais"+" with salary "+36000.0;
        Assertions.assertEquals(result,salary.mailCheck());

    }

    @Test
    void testOfComputePayForSalary() {
        Salary salary=new Salary("Owais","India",24000);
        double result=461.53846153846155;
        Assertions.assertEquals(result,salary.computePay());
    }
    @Test
    void testToSetSalary() {
        Salary salary=new Salary("Owais","India",24000);
        salary.setSalary(36000);
        Assertions.assertEquals(36000,salary.getSalaryAmt());
    }
    @Test
    void testToSetSalaryNotEquals() {
        Salary salary=new Salary("Owais","India",24000);
        salary.setSalary(-1);
        Assertions.assertNotEquals(-1,salary.getSalaryAmt());
    }

}