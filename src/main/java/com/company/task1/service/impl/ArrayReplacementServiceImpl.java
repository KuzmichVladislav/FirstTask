package com.company.task1.service.impl;

import com.company.task1.service.ArrayReplacementService;
import com.company.task1.entity.CustomArray;
import com.company.task1.exception.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.company.task1.validator.ArrayValidator.validateArray;

public class ArrayReplacementServiceImpl implements ArrayReplacementService {

    static final Logger logger = LogManager.getLogger();

    //replacing zero values with -1
    //@Override
    public void replacementZero(CustomArray array) throws ArrayException {
        if (validateArray(array)) {
            logger.error("invalid array" + array);
            throw new ArrayException();
        }
        int[] tempArray = array.getArray();
        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] == 0) {
                tempArray[i] = -1;
            }
        }
        array.setArray(tempArray);
    }
}
