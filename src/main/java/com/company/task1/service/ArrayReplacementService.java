package com.company.task1.service;

import com.company.task1.exception.ArrayException;
import com.company.task1.entity.CustomArray;

public interface ArrayReplacementService {

    void replacementZero(CustomArray array) throws ArrayException;
}
