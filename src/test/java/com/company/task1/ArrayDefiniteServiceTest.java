package com.company.task1;

import com.company.task1.entity.CustomArray;
import com.company.task1.exception.ArrayException;
import com.company.task1.service.impl.ArrayDefiniteServiceImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayDefiniteServiceTest {

    int[] testArray = new int[]{1, 3, 5, -4};
    CustomArray testClass = new CustomArray(testArray);

    @Test
    public void testDeterminationAmount() throws ArrayException {
        ArrayDefiniteServiceImpl instance = new ArrayDefiniteServiceImpl();
        int expResult = 5;
        int actual = instance.definiteAmount(testClass);
        assertEquals(expResult, actual);
    }

    @Test
    public void testDeterminationAverage() throws ArrayException {
        ArrayDefiniteServiceImpl instance = new ArrayDefiniteServiceImpl();
        double expResult = 1.25;
        double actual = instance.definiteAverage(testClass);
        assertEquals(expResult, actual, 0.001);
    }

    @Test
    public void testDeterminationPositive() throws ArrayException {
        ArrayDefiniteServiceImpl instance = new ArrayDefiniteServiceImpl();
        int expResult = 3;
        int actual = instance.definitePositive(testClass);
        assertEquals(expResult, actual);
    }

    @Test
    public void testDeterminationNegative() throws ArrayException {
        ArrayDefiniteServiceImpl instance = new ArrayDefiniteServiceImpl();
        int expResult = 1;
        int actual = instance.definiteNegative(testClass);
        assertEquals(expResult, actual);
    }

}
