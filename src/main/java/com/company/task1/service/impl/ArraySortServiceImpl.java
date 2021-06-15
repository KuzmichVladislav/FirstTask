package com.company.task1.service.impl;

import com.company.task1.entity.CustomArray;
import com.company.task1.service.ArraySortService;

import java.util.stream.IntStream;

public class ArraySortServiceImpl implements ArraySortService {

    @Override
    public void intStreamSort(CustomArray array) {
        int[] tempArray = array.getArray();
        IntStream stream = IntStream.of(tempArray);
        array.setArray(stream.sorted().toArray());
    }

    @Override
    public void bubbleSort(CustomArray array) {
        int[] tempArray = array.getArray();
        int temp;
        for (int i = 0; i < tempArray.length; i++) {
            for (int j = 1; j < (tempArray.length - i); j++) {
                if (tempArray[j - 1] > tempArray[j]) {
                    temp = tempArray[j - 1];
                    tempArray[j - 1] = tempArray[j];
                    tempArray[j] = temp;
                }
            }
        }
        array.setArray(tempArray);
    }

    @Override
    public void selectionSort(CustomArray array) {
        int[] tempArray = array.getArray();
        for (int i = 0; i < tempArray.length; i++) {
            int min = tempArray[i];
            int minIndex = i;
            for (int j = i + 1; j < tempArray.length; j++) {
                if (tempArray[j] < min) {
                    min = tempArray[j];
                    minIndex = j;
                }
            }
            int temp = tempArray[i];
            tempArray[i] = min;
            tempArray[minIndex] = temp;
        }
        array.setArray(tempArray);
    }

    @Override
    public void insertionSort(CustomArray array) {
        int[] tempArray = array.getArray();
        for (int i = 1; i < tempArray.length; i++) {
            int current = tempArray[i];
            int j = i - 1;
            while (j >= 0 && current < tempArray[j]) {
                tempArray[j + 1] = tempArray[j];
                j--;
            }
            tempArray[j + 1] = current;
        }
        array.setArray(tempArray);
    }
}
