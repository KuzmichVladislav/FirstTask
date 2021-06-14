package com.company.task1.parser;

public class ArrayParser {

    private static final String REGEX_SPLIT_ARRAY = "\\p{Punct}*\\s+";

    public int[] parseString(String stringArray) {
        String[] splited = stringArray.split(REGEX_SPLIT_ARRAY);
        int[] number = new int[splited.length];
        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(splited[i]);
        }
        return number;
    }
}
