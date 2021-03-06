package com.company.task1.service;

import com.company.task1.entity.CustomArray;

public interface ArraySortService {

    void intStreamSort(CustomArray array);

    void bubbleSort(CustomArray array);

    void selectionSort(CustomArray array);

    void insertionSort(CustomArray array);

}
