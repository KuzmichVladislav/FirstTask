package com.company.task1.service.impl;

import com.company.task1.entity.CustomArray;
import com.company.task1.exception.ArrayException;
import com.company.task1.service.ArraySortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.company.task1.validator.ArrayValidator.validateArray;

public class ArraySortServiceImpl implements ArraySortService {

    static final Logger logger = LogManager.getLogger();

    @Override
    public void bubbleSort(CustomArray array) throws ArrayException {
        if (validateArray(array)) {
            logger.error("invalid array " + array.toString());
            throw new ArrayException();
        }
        int[] tempArray = array.getArray();
        int temp;
        for (int i = 0; i < tempArray.length; i++) {
            for (int j = 1; j < (tempArray.length - i); j++) {
                if (tempArray[j - 1] > tempArray[j]) {
                    temp = tempArray[j - 1];
                    tempArray[j - 1] = tempArray[j];
                    tempArray[j] = temp;
                }
            }
        }
        array.setArray(tempArray);
    }

    @Override
    public void selectionSort(CustomArray array) throws ArrayException {
        if (validateArray(array)) {
            logger.error("invalid array " + array.toString());
            throw new ArrayException();
        }
        int[] tempArray = array.getArray();
        for (int i = 0; i < tempArray.length; i++) {
            int min = tempArray[i];
            int minId = i;
            for (int j = i + 1; j < tempArray.length; j++) {
                if (tempArray[j] < min) {
                    min = tempArray[j];
                    minId = j;
                }
            }
            int temp = tempArray[i];
            tempArray[i] = min;
            tempArray[minId] = temp;
        }
        array.setArray(tempArray);
    }

    @Override
    public void insertionSort(CustomArray array) throws ArrayException {
        if (validateArray(array)) {
            logger.error("invalid array " + array.toString());
            throw new ArrayException();
        }
        int[] tempArray = array.getArray();
        for (int i = 1; i < tempArray.length; i++) {
            int current = tempArray[i];
            int j = i - 1;
            while (j >= 0 && current < tempArray[j]) {
                tempArray[j + 1] = tempArray[j];
                j--;
            }
            tempArray[j + 1] = current;
        }
        array.setArray(tempArray);
    }
}
