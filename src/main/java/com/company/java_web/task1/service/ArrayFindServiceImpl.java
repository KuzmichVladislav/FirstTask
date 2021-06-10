package com.company.java_web.task1.service;

import com.company.java_web.task1.Exception.ArrayException;
import com.company.java_web.task1.entity.CustomArray;

public class ArrayFindServiceImpl implements ArrayFindService {

    @Override
    public int findMin(CustomArray array) throws ArrayException {
        if (array.isInvalid()) {
            throw new ArrayException("invalid array");
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
            throw new ArrayException("invalid array");
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
