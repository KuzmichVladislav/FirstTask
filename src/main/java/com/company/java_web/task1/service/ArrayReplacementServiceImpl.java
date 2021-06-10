package com.company.java_web.task1.service;

import com.company.java_web.task1.entity.CustomArray;
import com.company.java_web.task1.exception.ArrayException;
import org.apache.log4j.Logger;

public class ArrayReplacementServiceImpl implements ArrayReplacementService {

    final static Logger logger = Logger.getLogger(ArrayReplacementServiceImpl.class);

    //replacing zero values with -1
    @Override
    public void replacementZero(CustomArray array) throws ArrayException {
        if (array.isInvalid()) {
            logger.error("invalid array");
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
