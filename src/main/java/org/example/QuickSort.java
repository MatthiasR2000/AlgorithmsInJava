package org.example;

public class QuickSort {

    /*
     * Hauptmethode für Quicksort, sortiert ein Array rekursiv.
     * Parameter:
     * - array: Das zu sortierende Array
     * - start: Index des ersten Elements im aktuellen Teil-Array
     * - end: Index des letzten Elements im aktuellen Teil-Array
     */
    public static void quicksort(int[] array, int start, int end) {
        /*
         * Prüft, ob das Teil-Array mehr als ein Element hat.
         * Wenn start >= end, ist das Teil-Array leer oder hat nur ein Element,
         * dann wird nichts sortiert und die Rekursion stoppt.
         */
        if (start < end) {
            /*
             * Teilt das Array um ein Pivot-Element und gibt die Position des Pivots zurück.
             * Danach wird das linke und rechte Teil-Array rekursiv sortiert.
             */
            int pivotIndex = partition(array, start, end);
            quicksort(array, start, pivotIndex - 1);  // Sortiert das linke Teil-Array
            quicksort(array, pivotIndex + 1, end);    // Sortiert das rechte Teil-Array
        }
    }

    /*
     * Partitioniert das Array um ein Pivot-Element.
     * Wählt das letzte Element als Pivot und ordnet kleinere Elemente links,
     * größere Elemente rechts davon an.
     * Rückgabewert: Die endgültige Position des Pivots.
     */
    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];  // Pivot ist das letzte Element
        /*
         * i markiert die Grenze der "kleiner-gleich"-Region.
         * Startet vor dem Array (start - 1) und wird erhöht,
         * wenn ein kleineres oder gleich großes Element gefunden wird.
         */
        int i = start - 1;

        /*
         * Durchläuft das Array von start bis end-1 (ohne das Pivot).
         * Prüft jedes Element und tauscht es in die "kleiner-gleich"-Region,
         * wenn es kleiner oder gleich dem Pivot ist.
         */
        for (int j = start; j < end; j++) {
            if (array[j] <= pivot) {
                i++;  // Erweitert die "kleiner-gleich"-Region
                swap(array, i, j);  // Tauscht das Element an die richtige Stelle
            }
        }

        /*
         * Platziert das Pivot an der richtigen Stelle nach der Partitionierung,
         * indem es mit dem Element an i + 1 getauscht wird.
         */
        swap(array, i + 1, end);
        return i + 1;  // Gibt die Pivot-Position zurück
    }

    /*
     * Hilfsfunktion zum Tauschen von zwei Elementen im Array.
     * - i: Index des ersten Elements
     * - j: Index des zweiten Elements
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];  // Speichert das erste Element temporär
        array[i] = array[j];  // Überschreibt das erste mit dem zweiten
        array[j] = temp;      // Setzt das temporäre Element an die zweite Stelle
    }
}