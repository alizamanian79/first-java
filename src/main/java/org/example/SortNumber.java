package org.example;

import java.util.Arrays;
import java.util.Collections;

public class SortNumber {

    static int[] sortNumber(int[] numbers) {
        Arrays.sort(numbers);
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2,4,5,3};
        int[] sortedNumbers = sortNumber(numbers);

        System.out.println("Sorted Numbers: " + Arrays.toString(sortedNumbers));
    }
}