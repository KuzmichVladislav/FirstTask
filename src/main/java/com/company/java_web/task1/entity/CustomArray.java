package com.company.java_web.task1.entity;

import java.util.Arrays;

public class CustomArray {

    private int[] array;

    public boolean isInvalid() {
        return this.array.length < 0 || this.array == null ? true : false;
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
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Arrays.hashCode(this.array);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CustomArray other = (CustomArray) obj;
        return Arrays.equals(this.array, other.array);
    }
}
