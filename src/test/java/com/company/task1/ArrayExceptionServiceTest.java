package com.company.task1;

import com.company.task1.entity.CustomArray;
import com.company.task1.exception.ArrayException;
import com.company.task1.service.impl.ArrayReplacementServiceImpl;
import org.junit.Test;

public class ArrayExceptionServiceTest {

    @Test(expected = Exception.class)
    public void testArrayException() throws ArrayException {
        int[] testArray = new int[-1];
        CustomArray testClass = new CustomArray(testArray);
        ArrayReplacementServiceImpl instance = new ArrayReplacementServiceImpl();
        instance.replacementZero(testClass);
    }
}
