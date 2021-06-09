package com.company.java_web.task1.service;

import com.company.java_web.task1.entity.CustomArray;

public class ArrayDeterminationServiceImpl implements ArrayDeterminationService {

    public int determinationAmount(CustomArray array) {
        int[] tempArray = array.getArray();
        int sum = 0;
        for (int i : tempArray) {
            sum += i;
        }
        return sum;
    }

    public double determinationAverage(CustomArray array) {
        int[] tempArray = array.getArray();
        return determinationAmount(array) / (double) tempArray.length;
    }

    public int determinationPositive(CustomArray array) {
        int[] tempArray = array.getArray();
        int positive = 0;
        for (int i : tempArray) {
            if (i > 0) {
                ++positive;
            }
        }
        return positive;
    }

    public int determinationNegative(CustomArray array) {
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
