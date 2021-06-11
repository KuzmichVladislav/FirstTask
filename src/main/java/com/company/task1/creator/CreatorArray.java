package com.company.task1.creator;

import com.company.task1.entity.CustomArray;

public class CreatorArray {

    public CustomArray createCustomArray(int[] arrayInt) {
        CustomArray array;
        array = new CustomArray(arrayInt);
        return array;
    }
}
