package com.company.task1.service.impl;

import com.company.task1.entity.CustomArray;
import org.junit.Test;

public class ArrayExceptionServiceImplTest {

    @Test(expected = Exception.class)
    public void testArrayException() {
        int[] testArray = new int[-1];
        CustomArray testClass = new CustomArray(testArray);
        ArrayReplacementServiceImpl instance = new ArrayReplacementServiceImpl();
        instance.replacementZero(testClass);
    }
}
