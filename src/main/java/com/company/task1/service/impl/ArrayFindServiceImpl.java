package com.company.task1.service.impl;

import com.company.task1.service.ArrayFindService;
import com.company.task1.entity.CustomArray;
import com.company.task1.exception.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.company.task1.validator.ArrayValidator.validateArray;

public class ArrayFindServiceImpl implements ArrayFindService {

    static final Logger logger = LogManager.getLogger();

    @Override
    public int findMin(CustomArray array) throws ArrayException {
        if (validateArray(array)) {
            logger.error("invalid array" + array);
            throw new ArrayException();
        }
        int[] tempArray = array.getArray();
        int min = tempArray[0];
        for (int i : tempArray) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    @Override
    public int findMax(CustomArray array) throws ArrayException {
        if (validateArray(array)) {
            logger.error("invalid array" + array);
            throw new ArrayException();
        }
        int[] tempArray = array.getArray();
        int max = tempArray[0];
        for (int i : tempArray) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
