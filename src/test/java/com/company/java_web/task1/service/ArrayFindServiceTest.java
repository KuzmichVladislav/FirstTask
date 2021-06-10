package com.company.java_web.task1.service;

import com.company.java_web.task1.exception.ArrayException;
import com.company.java_web.task1.entity.CustomArray;

import static org.junit.Assert.assertEquals;

public class ArrayFindServiceTest {

    int[] testArray = new int[]{1, 3, 5, -4};
    CustomArray testClass = new CustomArray(testArray);

    public ArrayFindServiceTest() {
    }

    @org.junit.Test
    public void testFindMin() throws ArrayException {
        System.out.println("findMin");
        ArrayFindServiceImpl instance = new ArrayFindServiceImpl() {
        };
        int expResult = -4;
        int result = instance.findMin(testClass);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testFindMax() throws ArrayException {
        System.out.println("findMax");
        ArrayFindServiceImpl instance = new ArrayFindServiceImpl();
        int expResult = 5;
        int result = instance.findMax(testClass);
        assertEquals(expResult, result);
    }
}
