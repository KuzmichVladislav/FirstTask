package com.company.task1.service.impl;

import com.company.task1.entity.CustomArray;
import com.company.task1.service.ArrayFindService;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ArrayFindServiceImpl implements ArrayFindService {

    @Override
    public int findMin(CustomArray array) {
        int[] tempArray = array.getArray();
        IntStream stream = IntStream.of(tempArray);
        return stream.min().getAsInt();
    }

    @Override
    public int findMax(CustomArray array) {
        int[] tempArray = array.getArray();
        IntStream stream = IntStream.of(tempArray);
        return stream.max().getAsInt();
    }
}
