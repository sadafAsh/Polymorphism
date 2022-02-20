package com.soj.polymorphism.runtime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testToGetNameForEmployee() {
        Employee employee=new Employee("Owais","Uk");
        Assertions.assertEquals("Owais",employee.getName());
    }

    @Test
    void testToSetNameForEmployee() {
        Employee employee=new Employee("Owais","Uk");
        employee.setName("Owais");
        Assertions.assertEquals("Owais",employee.getName());
    }

    @Test
    void testToGetAddressForEmployee() {
        Employee employee=new Employee("Owais","Uk");
        Assertions.assertEquals("Uk",employee.getAddress());
    }

    @Test
    void testToSetAddressForEmployee() {
        Employee employee=new Employee("Owais","Uk");
        employee.setAddress("Uk");
        Assertions.assertEquals("Uk",employee.getAddress());
    }

    @Test
    void testToMailCheck() {
        Employee employee=new Employee("Owais","Uk");
        String result="Mailing a check to "+"Owais" + " "+"Uk";
        Assertions.assertEquals(result,employee.mailCheck());
    }

    @Test
    void testToString() {
        Employee employee=new Employee("Owais","Uk");
        String result="Owais" +" "+"Uk";
        Assertions.assertEquals(result,employee.toString());
    }
}