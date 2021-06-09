package com.company.java_web.task1.service;

import com.company.java_web.task1.entity.CustomArray;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayDeterminationServiceTest {

    int[] testArray = new int[]{1, 3, 5, -4};
    CustomArray testClass = new CustomArray(testArray);

    public ArrayDeterminationServiceTest() {
    }

    @Test
    public void testDeterminationAmount() {
        System.out.println("determinationAmount");
        int expResult = 5;
        int result = ArrayDeterminationService.determinationAmount(testClass);
        assertEquals(expResult, result);
    }

    @Test
    public void testDeterminationAverage() {
        System.out.println("determinationAverage");
        ArrayDeterminationService instance = new ArrayDeterminationService();
        double expResult = 1.25;
        double result = instance.determinationAverage(testClass);
        assertEquals(expResult, result, 0.001);
    }

    @Test
    public void testDeterminationPositive() {
        System.out.println("determinationPositive");
        ArrayDeterminationService instance = new ArrayDeterminationService();
        int expResult = 3;
        int result = instance.determinationPositive(testClass);
        assertEquals(expResult, result);
    }

    @Test
    public void testDeterminationNegative() {
        System.out.println("determinationNegative");
        ArrayDeterminationService instance = new ArrayDeterminationService();
        int expResult = 1;
        int result = instance.determinationNegative(testClass);
        assertEquals(expResult, result);
    }

}
