package com.company.task1.reader.impl;

import com.company.task1.exception.ArrayException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayReaderImplTest {

    @Test
    public void testStringArray() throws ArrayException {
        //String pathToFile = this.getClass().getClassLoader().getResource("data/arrayFile.txt").toString(); file:/C:/Users/kon/Documents/Projects/FirstTask/target/classes/data/arrayFile.txt

        final String FILE_NAME = "target/classes/data/arrayFile.txt";
        ArrayReaderImpl instance = new ArrayReaderImpl();
        String expResult = "10 -15 83 47 -1 0 3 0 57";
        String actual = instance.stringArray(FILE_NAME);
        assertEquals(expResult, actual);
    }

}
