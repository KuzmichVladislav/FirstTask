package com.company.task1.service.impl;

import com.company.task1.entity.CustomArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayFindServiceImplTest {

    @Test
    public void testFindMin() {
        int[] testArray = new int[]{1, 3, 5, -4};
        CustomArray testClass = new CustomArray(testArray);
        ArrayFindServiceImpl instance = new ArrayFindServiceImpl();
        int expResult = -4;
        int actual = instance.findMin(testClass);
        assertEquals(expResult, actual);
    }

    @Test
    public void testFindMax() {
        int[] testArray = new int[]{1, 3, 5, -4};
        CustomArray testClass = new CustomArray(testArray);
        ArrayFindServiceImpl instance = new ArrayFindServiceImpl();
        int expResult = 5;
        int actual = instance.findMax(testClass);
        assertEquals(expResult, actual);
    }
}
