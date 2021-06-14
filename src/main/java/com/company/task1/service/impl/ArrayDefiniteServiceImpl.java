package com.company.task1.service.impl;

import com.company.task1.entity.CustomArray;
import com.company.task1.exception.ArrayException;
import com.company.task1.service.ArrayDefiniteService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.company.task1.validator.ArrayValidator.validateArray;

public class ArrayDefiniteServiceImpl implements ArrayDefiniteService {

    static final Logger logger = LogManager.getLogger();

    @Override
    public int definiteAmount(CustomArray array) throws ArrayException {
        if (validateArray(array)) {
            logger.error("invalid array " + array.toString());
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
    public double definiteAverage(CustomArray array) throws ArrayException {
        int[] tempArray = array.getArray();
        return definiteAmount(array) / (double) tempArray.length;
    }

    @Override
    public int definitePositive(CustomArray array) throws ArrayException {
        if (validateArray(array)) {
            logger.error("invalid array " + array.toString());
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
    public int definiteNegative(CustomArray array) throws ArrayException {
        if (validateArray(array)) {
            logger.error("invalid array " + array.toString());
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
