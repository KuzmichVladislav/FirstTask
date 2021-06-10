package com.company.task1;

import com.company.task1.entity.CustomArray;
import com.company.task1.exception.ArrayException;
import com.company.task1.service.impl.ArrayFindServiceImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayFindServiceTest {

    int[] testArray = new int[]{1, 3, 5, -4};
    CustomArray testClass = new CustomArray(testArray);

    @Test
    public void testFindMin() throws ArrayException {
        ArrayFindServiceImpl instance = new ArrayFindServiceImpl();
        int expResult = -4;
        int actual = instance.findMin(testClass);
        assertEquals(expResult, actual);
    }

    @Test
    public void testFindMax() throws ArrayException {
        ArrayFindServiceImpl instance = new ArrayFindServiceImpl();
        int expResult = 5;
        int actual = instance.findMax(testClass);
        assertEquals(expResult, actual);
    }
}
