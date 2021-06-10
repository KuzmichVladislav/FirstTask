package com.company.java_web.task1.service;

import com.company.java_web.task1.Exception.ArrayException;
import com.company.java_web.task1.entity.CustomArray;
import org.junit.Test;

public class ArrayExceptionServiceTest {

    public ArrayExceptionServiceTest() {
    }

    @Test(expected = Exception.class)
    public void testArrayException() throws ArrayException {
        System.out.println("ArrayException");
        int[] testArray = new int[-1];
        CustomArray testClass = new CustomArray(testArray);
        ArrayReplacementServiceImpl instance = new ArrayReplacementServiceImpl();
        instance.replacementZero(testClass);
    }
}
