package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numberArray = {3,56,1,267,55};
        System.out.println("Originales Array: " + Arrays.toString(numberArray));
        SelectionSort.selectionSort(numberArray);
        BinarySearch.binarySearch();

        QuickSort.quicksort(numberArray, 0, numberArray.length - 1);
        System.out.println("Sortiertes Array Quick Sort: " + Arrays.toString(numberArray));
    }
}