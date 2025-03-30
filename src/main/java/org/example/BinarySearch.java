package org.example;

public class BinarySearch {
    public static void binarySearch() {
        System.out.println("Binary Search:");
        int[] sortedArray = {1, 5, 14, 21, 45, 67, 120}; // Sortiertes Array
        int number = 14; // Zahl, nach der gesucht wird
        int low = 0;     // Untere Grenze
        int high = sortedArray.length - 1; // Obere Grenze

        System.out.println("Es wird nach " + number + " gesucht");

        while (low <= high) { // Solange ein Suchbereich existiert
            int mid = (low + high) / 2; // Mittelpunkt berechnen passiert mehrmals bis die gesuchte Zahl herauskommt

            if (sortedArray[mid] == number) { // Zahl gefunden
                System.out.println("Zahl " + number + " gefunden an Index: " + mid);
                return; // Suche beenden
            } else if (sortedArray[mid] > number) { // Zahl ist kleiner heißt alles rechts von der mid weg
                high = mid - 1; // Linke Hälfte durchsuchen mit neuem Suchbereich
            } else if (sortedArray[mid] < number) { // Zahl ist größer heißt alles links von der mid weg
                low = mid + 1; // Rechte Hälfte durchsuchen mit neuem Suchbereich
            }
        }
        System.out.println("Zahl " + number + " wurde nicht gefunden.");
    }
}