package com.company.task1.service.impl;

import com.company.task1.entity.CustomArray;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayReplacementServiceImplTest {

    @Test
    public void testReplacementZero() {
        int[] testArray = new int[]{0, 3, 5, -4, 0, 14, 0};
        CustomArray testClass = new CustomArray(testArray);
        ArrayReplacementServiceImpl instance = new ArrayReplacementServiceImpl();
        int[] expResult = new int[]{-1, 3, 5, -4, -1, 14, -1};
        instance.replacementZero(testClass);
        assertArrayEquals(expResult, testClass.getArray());
    }
}
