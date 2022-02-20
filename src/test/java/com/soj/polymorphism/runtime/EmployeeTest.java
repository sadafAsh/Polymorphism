package com.soj.polymorphism.runtime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testToGetNameOfEmployee() {
        Employee employee=new Employee("Owais","Pune");
        employee.setName("Owais");
        Assertions.assertEquals("Owais",employee.getName());
    }

    @Test
    void testToGetAddressOfEmployee() {
        Employee employee=new Employee("Owais","Pune");
        employee.setAddress("Pune");
        Assertions.assertEquals("Pune",employee.getAddress());
    }

    @Test
    void testForMailCheckOfEmployee() {
        Employee employee=new Employee("Owais","Pune");
        String result="Mailing a check to "+"Owais" + " "+"Pune";
        Assertions.assertEquals(result,employee.mailCheck());
    }



    @Test
    void testToString() {
        Employee employee=new Employee("Owais","Pune");
       String result= "Owais" +" "+"Pune";
       Assertions.assertEquals(result,employee.toString());
    }
}