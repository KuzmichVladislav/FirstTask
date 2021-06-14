package com.company.task1.service;

import com.company.task1.entity.CustomArray;
import com.company.task1.exception.ArrayException;

public interface ArrayReplacementService {

    void replacementZero(CustomArray array) throws ArrayException;
}
