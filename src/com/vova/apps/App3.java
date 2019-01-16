package com.vova.apps;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sequence of numbers");
        String seq = input.nextLine();

        String result = sort(seq);

        System.out.print(result);
    }

    /**
     * Function to sort the text string in descending order
     *
     * @param seqToSort sequence to sort
     * @return sorted string
     */
    public static String sort(String seqToSort) {
        char[] A = seqToSort.toCharArray();

        for (int j = 1; j < A.length; j++) {
            char key = A[j];
            int i = j - 1;
            while (i >= 0 && A[i] < key) {
                A[i + 1] = A[i];
                i = i - 1;
            }
            A[i + 1] = key;
        }

        return new String(A);
    }



}

