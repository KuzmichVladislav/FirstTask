package com.company.task1.reader.impl;

import com.company.task1.exception.ArrayException;
import com.company.task1.reader.ArrayReader;
import com.company.task1.validator.ArrayValidator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArrayReaderImpl implements ArrayReader {

    public static void main(String[] args) throws ArrayException {
        ArrayReaderImpl a = new ArrayReaderImpl();
        String b = a.stringArray();
        System.out.println(b);

    }

    @Override
    public String stringArray() throws ArrayException {
        String array = "";
        try {
            FileReader file = new FileReader("src\\main\\resources\\data\\arrayFile.txt");
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
            throw new ArrayException(e.getMessage());
        }
        return array;
    }
}
