package com.company.task1.reader.impl;

import com.company.task1.exception.ArrayException;
import com.company.task1.reader.ArrayReader;
import com.company.task1.validator.ArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArrayReaderImpl implements ArrayReader {

    static final Logger logger = LogManager.getLogger();

    private static final String FILE_NAME = "src\\main\\resources\\data\\arrayFile.txt";

    @Override
    public String stringArray() throws ArrayException {
        String array = "";
        try {
            FileReader file = new FileReader(FILE_NAME);
            BufferedReader reader = new BufferedReader(file);
            String line = reader.readLine();

            while (line != null) {
                if (ArrayValidator.validateStringArray(line)) {
                    array = line;
                    break;
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            logger.error("file exception " + array);
            throw new ArrayException(e.getMessage());
        }
        return array;
    }
}
