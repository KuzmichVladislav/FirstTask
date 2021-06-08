package com.company.java_web.task1;

public class Replacement {
    //Замена нулевых элементов массива на -1
    public void replacementZero(CustomArray array) {
        int[] tempArray = array.getArray();
        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] == 0) {
                tempArray[i] = -1;
            }
        }
    }
}

