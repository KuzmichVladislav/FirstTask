package com.company.java_web.task1.service;

import com.company.java_web.task1.entity.CustomArray;

public class ArrayFindServiceImpl implements ArrayFindService {

    public int findMin(CustomArray array) {
        int[] tempArray = array.getArray();
        int min = tempArray[0];
        for (int i : tempArray) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public int findMax(CustomArray array) {
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
