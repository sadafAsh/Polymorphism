package com.soj.polymorphism;

import com.soj.polymorphism.compiletime.Shapes;
import com.soj.polymorphism.runtime.Employee;
import com.soj.polymorphism.runtime.Salary;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.debug("Compiletime Polymorphism");
Shapes shapes=new Shapes();
logger.debug("Area of Circle : {}",shapes.area(2));
logger.debug("Area of Triangle : {}",shapes.area(2.3,1.0));
logger.debug("Area of Rectangle : {}",shapes.area(2,3.2));
logger.info(".........................................");

logger.info("Runtime Polymorphism");
        Salary salary=new Salary("Jikar","UK",3600.00);
        Employee employee=new Salary("Asif","India",2400.00);
        logger.debug("Call mailCheck using Salary reference --");
        String mail=salary.mailCheck();
        logger.debug(mail);
        logger.debug("Call mailCheck using Employee reference--");
        String mail1=employee.mailCheck();
        logger.debug(mail1);


    }
}