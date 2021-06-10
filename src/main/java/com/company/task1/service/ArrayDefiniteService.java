package com.company.task1.service;

import com.company.task1.exception.ArrayException;
import com.company.task1.entity.CustomArray;

public interface ArrayDefiniteService {

    int definiteAmount(CustomArray array) throws ArrayException;

    double definiteAverage(CustomArray array) throws ArrayException;

    int definitePositive(CustomArray array) throws ArrayException;

    int definiteNegative(CustomArray array) throws ArrayException;
}
