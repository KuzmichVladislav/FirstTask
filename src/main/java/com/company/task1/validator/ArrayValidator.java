package com.company.task1.validator;

import com.company.task1.entity.CustomArray;

public class ArrayValidator {

    public static boolean validateArray(CustomArray array) {
        int[] tempArray = array.getArray();
        return tempArray.length < 0;
    }

}
