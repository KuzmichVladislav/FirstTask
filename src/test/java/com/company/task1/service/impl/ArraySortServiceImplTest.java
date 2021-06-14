package com.company.task1.service.impl;

import com.company.task1.entity.CustomArray;
import com.company.task1.exception.ArrayException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArraySortServiceImplTest {

    public ArraySortServiceImplTest() {
    }

    @Test
    public void testBubbleSort() throws ArrayException {
        CustomArray array = new CustomArray(new int[]{9, 5, 1, 3, 7, 8, 4, 6, 2, 0});
        ArraySortServiceImpl instance = new ArraySortServiceImpl();
        instance.bubbleSort(array);
        int[] expResult = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expResult, array.getArray());
    }

    @Test
    public void testSelectionSort() throws ArrayException {
        CustomArray array = new CustomArray(new int[]{9, 5, 1, 3, 7, 8, 4, 6, 2, 0});
        ArraySortServiceImpl instance = new ArraySortServiceImpl();
        instance.selectionSort(array);
        int[] expResult = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expResult, array.getArray());
    }

    @Test
    public void testInsertionSort() throws ArrayException {
        CustomArray array = new CustomArray(new int[]{9, 5, 1, 3, 7, 8, 4, 6, 2, 0});
        ArraySortServiceImpl instance = new ArraySortServiceImpl();
        instance.insertionSort(array);
        int[] expResult = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assert.assertArrayEquals(expResult, array.getArray());

    }

}
