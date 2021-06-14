package com.company.task1.creator;

import com.company.task1.entity.CustomArray;

public class CreatorArray {

    public CustomArray createCustomArray(int[] arrayInt) {
        return new CustomArray(arrayInt);
    }
}
