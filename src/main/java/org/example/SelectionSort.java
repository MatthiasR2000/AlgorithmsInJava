package org.example;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        System.out.println("Selection Sort:");
        int sizeOfArray = array.length;
        for (int i = 0; i < sizeOfArray - 1; i++) {
            int minIndex = i; // Setze das erste unsortierte Element als vorläufig größtes Element
            for (int j = i + 1; j < sizeOfArray; j++) { // Starte bei i+1, da das Element bei i bereits betrachtet wurde
                if (array[j] < array[minIndex]) { // Suche das größte Element im unsortierten Bereich
                    minIndex = j; // Aktualisiere den Index des größten Elements
                }
            }
            // Vertausche das gefundene größte Element mit dem ersten unsortierten Element
            int temp = array[minIndex]; // Speichere das größte Element temporär
            array[minIndex] = array[i]; // Setze das aktuelle Element an die Position des größten
            array[i] = temp; // Setze das größte Element an den Anfang des unsortierten Bereichs
        }
        // Gib das sortierte Array aus (absteigend sortiert)
        System.out.print("Sortiertes Array Selection Sort: [");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(array[i]);
            if (i < sizeOfArray - 1) { // Kein Komma nach dem letzten Element
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
