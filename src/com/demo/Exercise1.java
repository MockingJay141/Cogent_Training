package com.demo;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        int[] arr = {3,9,5,6,1,4, -2, -4};
        int temporary = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temporary = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temporary;
                }
            }
        }
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
        boolean found = false;
        for (int i = 1;i < arr.length; i++) {
            found = false;
            for (int j = 0; j < arr.length; j++) {
                int x = arr[j];
                if (x == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("missing value "+ i);
                break;
            }
        }

    }
}
