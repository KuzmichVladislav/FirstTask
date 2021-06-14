package com.company.task1.service.impl;

import com.company.task1.entity.CustomArray;
import com.company.task1.service.ArrayReplacementService;

public class ArrayReplacementServiceImpl implements ArrayReplacementService {

    //replacing zero values with -1
    @Override
    public void replacementZero(CustomArray array) {
        int[] tempArray = array.getArray();
        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] == 0) {
                tempArray[i] = -1;
            }
        }
        array.setArray(tempArray);
    }
}
