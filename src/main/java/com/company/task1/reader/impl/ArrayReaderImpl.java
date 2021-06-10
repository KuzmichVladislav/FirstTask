package com.company.task1.reader.impl;

import com.company.task1.exception.ArrayException;
import com.company.task1.reader.ArrayReader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayReaderImpl implements ArrayReader {

    @Override
    public List<String> listOfArray() throws ArrayException {
        List<String> listArray = new ArrayList<>();
        try {
            File file = new File("src\\main\\resources\\data\\arrayFile.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();

            while (line != null) {
                listArray.add(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new ArrayException(e.getMessage());
        } catch (IOException e) {
            throw new ArrayException(e.getMessage());
        }
        return listArray;
    }

    public static void main(String[] args) throws ArrayException {
        ArrayReaderImpl a = new ArrayReaderImpl();
        List<String> b =  a.listOfArray();
        System.out.println(b.toString());

    }
}
