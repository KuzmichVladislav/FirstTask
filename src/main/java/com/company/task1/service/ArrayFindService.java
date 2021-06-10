package com.company.task1.service;

import com.company.task1.exception.ArrayException;
import com.company.task1.entity.CustomArray;

public interface ArrayFindService {

    int findMin(CustomArray array) throws ArrayException;

    int findMax(CustomArray array) throws ArrayException;
}
