package com.company.task1.service.impl;

import com.company.task1.entity.CustomArray;
import com.company.task1.service.ArrayDefiniteService;

public class ArrayDefiniteServiceImpl implements ArrayDefiniteService {

    @Override
    public int definiteAmount(CustomArray array) {
        int[] tempArray = array.getArray();
        int sum = 0;
        for (int i : tempArray) {
            sum += i;
        }
        return sum;
    }

    @Override
    public double definiteAverage(CustomArray array) {
        int[] tempArray = array.getArray();
        return definiteAmount(array) / (double) tempArray.length;
    }

    @Override
    public int definitePositive(CustomArray array) {
        int[] tempArray = array.getArray();
        int positive = 0;
        for (int i : tempArray) {
            if (i > 0) {
                ++positive;
            }
        }
        return positive;
    }

    @Override
    public int definiteNegative(CustomArray array) {
        int[] tempArray = array.getArray();
        int negative = 0;
        for (int i : tempArray) {
            if (i < 0) {
                ++negative;
            }
        }
        return negative;
    }
}
