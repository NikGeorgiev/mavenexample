package com.spartaglobal.mavenexample;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();
    @Test
    public void testAddition() {
        Assert.assertEquals(3, calculator.add(2, 1));
    }

    @Test
    public void testSubtraction(){
            Assert.assertEquals(6, calculator.subtract(9, 4));
        }



    }

