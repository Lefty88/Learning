package com.vova.apps;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sequence of numbers");
        String seq = input.nextLine();
        System.out.println("Descending order?");
        boolean descending = input.nextBoolean();

        String result = sort(seq, descending);

        System.out.print(result);
    }

    /**
     * Function to sort the text string in descending order
     *
     * @param seqToSort sequence to sort
     * @return sorted string
     */
    public static String sort(String seqToSort, boolean descending) {
        char[] array = seqToSort.toCharArray();
        if (descending == true) {
            for (int j = 1; j < array.length; j++) {
                char key = array[j];
                int i = j - 1;
                while (i >= 0 && array[i] < key) {
                    array[i + 1] = array[i];
                    i = i - 1;
                }
                array[i + 1] = key;
            }
        } else {
            for (int j = 1; j < array.length; j++) {
                char key = array[j];
                int i = j - 1;
                while (i < 0 && array[i] > key) {
                    array[i + 1] = array[i];
                    i = i - 1;
                }
                array[i + 1] = key;
            }
        }
        return new String(array);
    }
}

