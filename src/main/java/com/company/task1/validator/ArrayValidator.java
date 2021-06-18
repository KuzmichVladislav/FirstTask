package com.company.task1.validator;

public class ArrayValidator {

    private static final String REGEX_STRING_ARRAY = "([\\d+-]*\\)*\\(*\\s*)+";

    private ArrayValidator() {
    }

    public static boolean validateStringArray(String string) {
        return string.matches(REGEX_STRING_ARRAY);
    }
}
