package com.company.task1;

import com.company.task1.entity.CustomArray;
import com.company.task1.exception.ArrayException;
import com.company.task1.service.impl.ArrayReplacementServiceImpl;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayReplacementServiceTest {

    int[] testArray = new int[]{0, 3, 5, -4, 0, 14, 0};
    CustomArray testClass = new CustomArray(testArray);

    @Test
    public void testReplacementZero() throws ArrayException {
        ArrayReplacementServiceImpl instance = new ArrayReplacementServiceImpl();
        int[] expResult = new int[]{-1, 3, 5, -4, -1, 14, -1};
        instance.replacementZero(testClass);
        assertArrayEquals(expResult, testClass.getArray());
    }
}
