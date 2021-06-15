package com.company.task1.service;

import com.company.task1.entity.CustomArray;

public interface ArrayDefiniteService {

    int definiteAmount(CustomArray array);

    double definiteAverage(CustomArray array);

    long definitePositive(CustomArray array);

    long definiteNegative(CustomArray array);
}
