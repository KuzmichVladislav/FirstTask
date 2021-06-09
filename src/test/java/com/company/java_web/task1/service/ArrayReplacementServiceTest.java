package com.company.java_web.task1.service;

import com.company.java_web.task1.entity.CustomArray;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayReplacementServiceTest {

    int[] testArray = new int[]{0, 3, 5, -4, 0, 14, 0};
    CustomArray testClass = new CustomArray(testArray);

    @Test
    public void testReplacementZero() {
        System.out.println("replacementZero");
        ArrayReplacementService instance = new ArrayReplacementService();
        int[] expResult = new int[]{-1, 3, 5, -4, -1, 14, -1};
        instance.replacementZero(testClass);
        assertArrayEquals(expResult, testClass.getArray());
    }
}
