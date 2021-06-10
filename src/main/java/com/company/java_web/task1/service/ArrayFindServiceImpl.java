package com.company.java_web.task1.service;

import com.company.java_web.task1.entity.CustomArray;
import com.company.java_web.task1.exception.ArrayException;
import org.apache.log4j.Logger;

public class ArrayFindServiceImpl implements ArrayFindService {

    final static Logger arrayLogger = Logger.getLogger(ArrayFindServiceImpl.class);

    @Override
    public int findMin(CustomArray array) throws ArrayException {
        if (array.isInvalid()) {
            arrayLogger.error("invalid array");
            throw new ArrayException();
        }
        int[] tempArray = array.getArray();
        int min = tempArray[0];
        for (int i : tempArray) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    @Override
    public int findMax(CustomArray array) throws ArrayException {
        if (array.isInvalid()) {
            arrayLogger.error("invalid array");
            throw new ArrayException();
        }
        int[] tempArray = array.getArray();
        int max = tempArray[0];
        for (int i : tempArray) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
