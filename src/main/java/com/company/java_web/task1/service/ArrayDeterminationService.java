package com.company.java_web.task1.service;

import com.company.java_web.task1.exception.ArrayException;
import com.company.java_web.task1.entity.CustomArray;

public interface ArrayDeterminationService {

    int determinationAmount(CustomArray array) throws ArrayException;

    double determinationAverage(CustomArray array) throws ArrayException;

    int determinationPositive(CustomArray array) throws ArrayException;

    int determinationNegative(CustomArray array) throws ArrayException;
}
