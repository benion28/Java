package com.benionpackage;

/*
package com.benionpackage;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] numbers = { 7, 3, 1, 4, 6, 2, 3 };
        var sorter = new BubbleSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

*/
public class BubbleSort {
    public void sort(int[] array) {
        boolean isSorted;
        for (var i = 0; i < array.length; i++) {
            isSorted = true;
            for (var j = 1; j < array.length-1; j++)
                if (array[j] < array[j-1]) {
                    swap(array, j, j-1);
                    isSorted = false;
                }
            if (isSorted)
                return;
        }
    }

    private void swap(int[] array, int index1, int index2) {
        var temporal = array[index1];
        array[index1] = array[index2];
        array[index2] = temporal;
    }
}
