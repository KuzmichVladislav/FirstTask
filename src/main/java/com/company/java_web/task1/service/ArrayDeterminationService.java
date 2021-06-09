package com.company.java_web.task1.service;

import com.company.java_web.task1.entity.CustomArray;

public interface ArrayDeterminationService {

    int determinationAmount(CustomArray array);

    double determinationAverage(CustomArray array);

    int determinationPositive(CustomArray array);

    int determinationNegative(CustomArray array);
}
