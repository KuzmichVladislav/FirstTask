package com.company.java_web.task1.service;

import com.company.java_web.task1.entity.CustomArray;

public class ArrayReplacementService {

    //replacing zero values ??with -1
    public static void replacementZero(CustomArray array) {
        int[] tempArray = array.getArray();
        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] == 0) {
                tempArray[i] = -1;
            }
        }
        array.setArray(tempArray);
    }
}
