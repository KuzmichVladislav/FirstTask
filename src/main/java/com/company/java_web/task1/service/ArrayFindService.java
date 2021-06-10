package com.company.java_web.task1.service;

import com.company.java_web.task1.Exception.ArrayException;
import com.company.java_web.task1.entity.CustomArray;

public interface ArrayFindService {

    int findMin(CustomArray array) throws ArrayException;

    int findMax(CustomArray array) throws ArrayException;
}
