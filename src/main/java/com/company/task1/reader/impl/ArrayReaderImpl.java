package com.company.task1.reader.impl;

import com.company.task1.exception.ArrayException;
import com.company.task1.reader.ArrayReader;
import com.company.task1.validator.ArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class ArrayReaderImpl implements ArrayReader {

    static final Logger logger = LogManager.getLogger();

    @Override
    public String stringArray(String path) throws ArrayException {

        String array;

        try (InputStream arrayStream = new FileInputStream(path);
             InputStreamReader arrayStreamReader = new InputStreamReader(arrayStream);
             BufferedReader reader = new BufferedReader(arrayStreamReader)) {

            while ((array = reader.readLine()) != null) {
                if (ArrayValidator.validateStringArray(array)) {
                    break;
                }
            }
            if (array == null) {
                logger.error("no valid row found");
                throw new ArrayException("no valid row found");
            }
        } catch (FileNotFoundException e) {
            logger.error("file was not found " + e);
            throw new ArrayException(e);
        } catch (IOException e) {
            logger.error("incorrect file " + e);
            throw new ArrayException(e);
        }
        return array;
    }
}
