package com.company.task1.validator;

import com.company.task1.entity.CustomArray;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayValidatorTest {

    public ArrayValidatorTest() {
    }

    @Test
    public void testValidateArray() {
        int[] testArray = new int[]{1, 3, 5, -4};
        CustomArray testClass = new CustomArray(testArray);
        boolean actual = ArrayValidator.validateArray(testClass);
        assertFalse(actual);
    }

    @Test
    public void testTrueValidateStringArray() {
        String string = "1 5 67 4 2 -4 0 -45";
        boolean actual = ArrayValidator.validateStringArray(string);
        assertTrue(actual);
    }

    @Test
    public void testFalseValidateStringArray() {
        String string = "1 5 67 4 2 -4 0 e45";
        boolean actual = ArrayValidator.validateStringArray(string);
        assertFalse(actual);
    }
}
