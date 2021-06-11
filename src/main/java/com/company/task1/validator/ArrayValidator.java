package com.company.task1.validator;

import com.company.task1.entity.CustomArray;

public class ArrayValidator {

    private static final String REGEX_STRING_ARRAY = "([\\d+-]*\\)*\\(*\\s*)+";

    public static boolean validateArray(CustomArray array) {
        return array.getArray().length < 0;
    }

    public static boolean validateStringArray(String string) {
        return string.matches(REGEX_STRING_ARRAY);
    }

}
