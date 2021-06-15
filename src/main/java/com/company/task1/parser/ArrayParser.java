package com.company.task1.parser;

import java.util.stream.Stream;

public class ArrayParser {

    private static final String REGEX_SPLIT_ARRAY = "\\p{Punct}*\\s+";

    public int[] parseString(String stringArray) {
        String[] splited = stringArray.split(REGEX_SPLIT_ARRAY);
        int[] arrayOfInt = Stream.of(splited).mapToInt(Integer::parseInt).toArray();
        return arrayOfInt;
    }
}
