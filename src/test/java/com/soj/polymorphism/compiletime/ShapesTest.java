package com.soj.polymorphism.compiletime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapesTest {

    @Test
    void testForAreaOfCircle() {
        Shapes shapes=new Shapes();
        double result=12.56;
        Assertions.assertEquals(result,shapes.area(2));

    }

    @Test
    void testForAreaOfSquare() {
        Shapes shapes=new Shapes();
        double result=4.2;
        Assertions.assertEquals(result,shapes.area(2,2.1));
    }

    @Test
    void testForAreaOfTriangle() {
        Shapes shapes=new Shapes();
        double result=1.38;
        Assertions.assertEquals(result,shapes.area(2.3,1.2));
    }
}