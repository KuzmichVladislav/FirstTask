package com.company.java_web.task1;

import java.util.Arrays;

public class CustomArray {
    private int[] array;

    public CustomArray() {
    }

    public CustomArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        int[] arrayForGet = new int[array.length];
        System.arraycopy(array, 0, arrayForGet, 0, array.length);
        return arrayForGet;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "CustomArray{" + Arrays.toString(array) + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomArray that = (CustomArray) o;

        return Arrays.equals(getArray(), that.getArray());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getArray());
    }
}
