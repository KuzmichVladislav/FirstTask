package com.company.java_web.task1.service;

import com.company.java_web.task1.entity.CustomArray;
import com.company.java_web.task1.exception.ArrayException;
import org.apache.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayDeterminationServiceTest {

    final static Logger arrayLogger = Logger.getLogger(ArrayDeterminationServiceTest.class);

    int[] testArray = new int[]{1, 3, 5, -4};
    CustomArray testClass = new CustomArray(testArray);

    public ArrayDeterminationServiceTest() {
    }

    @Test
    public void testDeterminationAmount() throws ArrayException {
        arrayLogger.info("determinationAmount test");
        ArrayDeterminationServiceImpl instance = new ArrayDeterminationServiceImpl();
        int expResult = 5;
        int result = instance.determinationAmount(testClass);
        assertEquals(expResult, result);
    }

    @Test
    public void testDeterminationAverage() throws ArrayException {
        arrayLogger.info("determinationAverage test");
        ArrayDeterminationServiceImpl instance = new ArrayDeterminationServiceImpl();
        double expResult = 1.25;
        double result = instance.determinationAverage(testClass);
        assertEquals(expResult, result, 0.001);
    }

    @Test
    public void testDeterminationPositive() throws ArrayException {
        arrayLogger.info("determinationPositive test");
        ArrayDeterminationServiceImpl instance = new ArrayDeterminationServiceImpl();
        int expResult = 3;
        int result = instance.determinationPositive(testClass);
        assertEquals(expResult, result);
    }

    @Test
    public void testDeterminationNegative() throws ArrayException {
        arrayLogger.info("determinationNegative test");
        ArrayDeterminationServiceImpl instance = new ArrayDeterminationServiceImpl();
        int expResult = 1;
        int result = instance.determinationNegative(testClass);
        assertEquals(expResult, result);
    }

}
