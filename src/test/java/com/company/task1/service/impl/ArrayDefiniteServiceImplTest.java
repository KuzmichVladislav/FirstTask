package com.company.task1.service.impl;

import com.company.task1.entity.CustomArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayDefiniteServiceImplTest {

    @Test
    public void testDeterminationAmount() {
        int[] testArray = new int[]{1, 3, 5, -4};
        CustomArray testClass = new CustomArray(testArray);
        ArrayDefiniteServiceImpl instance = new ArrayDefiniteServiceImpl();
        int expResult = 5;
        int actual = instance.definiteAmount(testClass);
        assertEquals(expResult, actual);
    }

    @Test
    public void testDeterminationAverage() {
        int[] testArray = new int[]{1, 3, 5, -4};
        CustomArray testClass = new CustomArray(testArray);
        ArrayDefiniteServiceImpl instance = new ArrayDefiniteServiceImpl();
        double expResult = 1.25;
        double actual = instance.definiteAverage(testClass);
        assertEquals(expResult, actual, 0.001);
    }

    @Test
    public void testDeterminationPositive() {
        int[] testArray = new int[]{1, 3, 5, -4};
        CustomArray testClass = new CustomArray(testArray);
        ArrayDefiniteServiceImpl instance = new ArrayDefiniteServiceImpl();
        int expResult = 3;
        long actual = instance.definitePositive(testClass);
        assertEquals(expResult, actual);
    }

    @Test
    public void testDeterminationNegative() {
        int[] testArray = new int[]{1, 3, 5, -4};
        CustomArray testClass = new CustomArray(testArray);
        ArrayDefiniteServiceImpl instance = new ArrayDefiniteServiceImpl();
        int expResult = 1;
        long actual = instance.definiteNegative(testClass);
        assertEquals(expResult, actual);
    }

}
