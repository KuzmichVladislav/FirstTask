package com.company.task1.parser;

public class ArrayParser {

    public int[] parseString(String stringArray) {
        String[] splited = stringArray.split(" ");
        int[] number = new int[splited.length];
        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(splited[i]);
        }
        return number;
    }
}
