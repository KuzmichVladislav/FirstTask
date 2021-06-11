package com.company.task1.service;

import com.company.task1.entity.CustomArray;
import com.company.task1.exception.ArrayException;

public interface ArraySortService {

    void bubbleSort(CustomArray array) throws ArrayException;

    void selectionSort(CustomArray array) throws ArrayException;

    void insertionSort(CustomArray array) throws ArrayException;
}
