package com.company.java_web.task1.service;

import com.company.java_web.task1.entity.CustomArray;
import com.company.java_web.task1.exception.ArrayException;
import org.apache.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayReplacementServiceTest {

    final static Logger logger = Logger.getLogger(ArrayReplacementServiceTest.class);

    int[] testArray = new int[]{0, 3, 5, -4, 0, 14, 0};
    CustomArray testClass = new CustomArray(testArray);

    @Test
    public void testReplacementZero() throws ArrayException {
        logger.info("replacementZero test");
        ArrayReplacementServiceImpl instance = new ArrayReplacementServiceImpl();
        int[] expResult = new int[]{-1, 3, 5, -4, -1, 14, -1};
        instance.replacementZero(testClass);
        assertArrayEquals(expResult, testClass.getArray());
    }
}
