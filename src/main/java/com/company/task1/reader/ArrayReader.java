package com.company.task1.reader;

import com.company.task1.exception.ArrayException;

import java.util.List;

public interface ArrayReader {

    List<String> listOfArray() throws ArrayException;
}
