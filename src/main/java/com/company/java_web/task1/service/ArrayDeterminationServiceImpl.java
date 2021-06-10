package com.company.java_web.task1.service;

import com.company.java_web.task1.entity.CustomArray;
import com.company.java_web.task1.exception.ArrayException;
import org.apache.log4j.Logger;

public class ArrayDeterminationServiceImpl implements ArrayDeterminationService {

    final static Logger arrayLogger = Logger.getLogger(ArrayDeterminationServiceImpl.class);

    @Override
    public int determinationAmount(CustomArray array) throws ArrayException {
        if (array.isInvalid()) {
            arrayLogger.error("invalid array");
            throw new ArrayException();
        }
        int[] tempArray = array.getArray();
        int sum = 0;
        for (int i : tempArray) {
            sum += i;
        }
        return sum;
    }

    @Override
    public double determinationAverage(CustomArray array) throws ArrayException {
        int[] tempArray = array.getArray();
        return determinationAmount(array) / (double) tempArray.length;
    }

    @Override
    public int determinationPositive(CustomArray array) throws ArrayException {
        if (array.isInvalid()) {
            arrayLogger.error("invalid array");
            throw new ArrayException();
        }
        int[] tempArray = array.getArray();
        int positive = 0;
        for (int i : tempArray) {
            if (i > 0) {
                ++positive;
            }
        }
        return positive;
    }

    @Override
    public int determinationNegative(CustomArray array) throws ArrayException {
        if (array.isInvalid()) {
            arrayLogger.error("invalid array");
            throw new ArrayException();
        }
        int[] tempArray = array.getArray();
        int negative = 0;
        for (int i : tempArray) {
            if (i < 0) {
                ++negative;
            }
        }
        return negative;
    }
}
