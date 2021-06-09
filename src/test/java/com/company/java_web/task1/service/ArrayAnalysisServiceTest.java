package com.company.java_web.task1.service;

import com.company.java_web.task1.entity.CustomArray;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class ArrayAnalysisServiceTest {

    int[] testArray = new int[]{1, 3, 5, -4};
    CustomArray testClass = new CustomArray(testArray);

    public ArrayAnalysisServiceTest() {
    }

    @org.junit.Test
    public void testFindMin() {
        System.out.println("findMin");
        ArrayAnalysisService instance = new ArrayAnalysisService();
        int expResult = -4;
        int result = instance.findMin(testClass);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testFindMax() {
        System.out.println("findMax");
        ArrayAnalysisService instance = new ArrayAnalysisService();
        int expResult = 5;
        int result = instance.findMax(testClass);
        assertEquals(expResult, result);
    }
}
