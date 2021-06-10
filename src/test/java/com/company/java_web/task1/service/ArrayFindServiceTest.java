package com.company.java_web.task1.service;

import com.company.java_web.task1.entity.CustomArray;
import com.company.java_web.task1.exception.ArrayException;
import org.apache.log4j.Logger;

import static org.junit.Assert.assertEquals;

public class ArrayFindServiceTest {

    final static Logger logger = Logger.getLogger(ArrayExceptionServiceTest.class);

    int[] testArray = new int[]{1, 3, 5, -4};
    CustomArray testClass = new CustomArray(testArray);

    public ArrayFindServiceTest() {
    }

    @org.junit.Test
    public void testFindMin() throws ArrayException {
        logger.info("findMin test");
        ArrayFindServiceImpl instance = new ArrayFindServiceImpl() {
        };
        int expResult = -4;
        int result = instance.findMin(testClass);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testFindMax() throws ArrayException {
        logger.info("findMax test");
        ArrayFindServiceImpl instance = new ArrayFindServiceImpl();
        int expResult = 5;
        int result = instance.findMax(testClass);
        assertEquals(expResult, result);
    }
}
