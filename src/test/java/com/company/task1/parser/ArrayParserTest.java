package com.company.task1.parser;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayParserTest {

    public ArrayParserTest() {
    }

    @Test
    public void testParseString() {
        String stringArray = "1 0 3 -4 5 6 -7 -8 9 11";
        ArrayParser instance = new ArrayParser();
        int[] expResult = new int[]{1, 0, 3, -4, 5, 6, -7, -8, 9, 11};
        int[] actual = instance.parseString(stringArray);
        assertArrayEquals(expResult, actual);
    }

}
