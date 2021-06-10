package com.company.java_web.task1.service;

import com.company.java_web.task1.entity.CustomArray;
import com.company.java_web.task1.exception.ArrayException;
import org.apache.log4j.Logger;
import org.junit.Test;

public class ArrayExceptionServiceTest {

    final static Logger logger = Logger.getLogger(ArrayExceptionServiceTest.class);

    public ArrayExceptionServiceTest() {
    }

    @Test(expected = Exception.class)
    public void testArrayException() throws ArrayException {
        logger.info("ArrayException test");
        int[] testArray = new int[-1];
        CustomArray testClass = new CustomArray(testArray);
        ArrayReplacementServiceImpl instance = new ArrayReplacementServiceImpl();
        instance.replacementZero(testClass);
    }
}
