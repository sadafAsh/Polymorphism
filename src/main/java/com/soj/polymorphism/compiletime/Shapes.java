package com.soj.polymorphism.compiletime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Shapes {
    static final Logger logger= LogManager.getLogger(Shapes.class.getName());



    public  double area(int r){
        return  3.14*r*r;
    }
    public double area(int l,int b){
        return l*b;
    }
    public double area(double b,double h){
        return 0.5*b*h;
    }
}
