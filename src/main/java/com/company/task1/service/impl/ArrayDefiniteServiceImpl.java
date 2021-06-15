package com.company.task1.service.impl;

import com.company.task1.entity.CustomArray;
import com.company.task1.service.ArrayDefiniteService;

import java.util.stream.IntStream;

public class ArrayDefiniteServiceImpl implements ArrayDefiniteService {

    @Override
    public int definiteAmount(CustomArray array) {
        int[] tempArray = array.getArray();
        IntStream stream = IntStream.of(tempArray);
        int amount = stream.sum();
        return amount;
    }

    @Override
    public double definiteAverage(CustomArray array) {
        int[] tempArray = array.getArray();
        IntStream stream = IntStream.of(tempArray);
        double average = stream.average().getAsDouble();
        return average;
    }

    @Override
    public long definitePositive(CustomArray array) {
        int[] tempArray = array.getArray();
        IntStream stream = IntStream.of(tempArray);
        long positive = stream.filter(p -> p > 0).count();
        return positive;
    }

    @Override
    public long definiteNegative(CustomArray array) {
        int[] tempArray = array.getArray();
        IntStream stream = IntStream.of(tempArray);
        long negative = stream.filter(p -> p < 0).count();
        return negative;
    }
}
