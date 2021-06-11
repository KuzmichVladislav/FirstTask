package com.company.task1.entity;

import java.util.Arrays;

public class CustomArray {

    private int[] array;

    public CustomArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
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
        return Arrays.hashCode(this.array);
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
