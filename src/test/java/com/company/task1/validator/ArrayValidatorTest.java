package com.company.task1.validator;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayValidatorTest {

    public ArrayValidatorTest() {
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
