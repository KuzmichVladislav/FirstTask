package com.company.task1.service.impl;

import com.company.task1.entity.CustomArray;
import com.company.task1.service.ArrayFindService;

public class ArrayFindServiceImpl implements ArrayFindService {

    @Override
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

    @Override
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
