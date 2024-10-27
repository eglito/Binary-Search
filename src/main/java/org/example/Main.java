package org.example;
import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        int[] array = new int[50];
        Random random = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(80);
        }

        int search = 5;
        System.out.println(Arrays.toString(array));
        System.out.println(Main.binarySearch(array, search));

    }

    public static void sort(int[] array){
            int[] novaArray = {};

            for(int i = 1; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                     if (array[i] < array[j]) {

                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                     }
                    novaArray = array;
               }
       }
    }

    public static String binarySearch (int array[], int search) {

            Main.sort(array);
            int half = array.length / 2;

            for (int i = 0; i < half; i++) {
                 if (array[i] == search) {
                     return search + " it's do present on the list, on position " + i;
                 } else {
                        for (int c = half + 1; c < array.length; c++) {
                             if (array[c] == search) {
                                 return search + " it's do present on the list, on position " + c;
                             }
                        }
                 }
            }
            return search + " it's doesn't present on the list.";
    }
}