package com.company.task1.service.impl;

import com.company.task1.entity.CustomArray;
import com.company.task1.service.ArrayReplacementService;

import java.util.stream.IntStream;

public class ArrayReplacementServiceImpl implements ArrayReplacementService {

    //replacing zero values with -1
    @Override
    public void replacementZero(CustomArray array) {
        int[] tempArray = array.getArray();
        IntStream stream = IntStream.of(tempArray);
        int[] replacementArray = stream.map(o -> {
            if (o == 0) {
                return -1;
            } else {
                return o;
            }
        }).toArray();
        array.setArray(replacementArray);
    }

}
