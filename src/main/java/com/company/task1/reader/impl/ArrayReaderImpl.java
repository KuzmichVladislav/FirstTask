package com.company.task1.reader.impl;

import com.company.task1.exception.ArrayException;
import com.company.task1.reader.ArrayReader;
import com.company.task1.validator.ArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArrayReaderImpl implements ArrayReader {

    static final Logger logger = LogManager.getLogger();

    @Override
    public String stringArray(String path) throws ArrayException {
        String array = "";
        String line;
        try {
            FileReader file = new FileReader(path);
            BufferedReader reader = new BufferedReader(file);
            while (reader.ready()) {
                line = reader.readLine();
                if (ArrayValidator.validateStringArray(line)) {
                    array = line;
                    break;
                }
            }
        } catch (FileNotFoundException e){
            logger.error("file was not found " + e);
            throw new ArrayException(e);
        } catch (IOException e) {
            logger.error("incorrect file " + e);
            throw new ArrayException(e);
        }
        return array;
    }
}
