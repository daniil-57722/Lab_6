package com.example.helloworld;
import java.util.Scanner;
public class helloworld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int array[] = new int[14];
        int arraysorted[] = new int[14];
        int k = 0;
        System.out.println("Insert array elements");
        for (int i = 0; i < 14; i++) {
            array[i] = input.nextInt();
            arraysorted[i] = array[i];
        }

        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            if (arraysorted[i] > 0 && array[k] > 0){
                arraysorted[i] = array[k];
            k++;}
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + arraysorted[i]);
        }
    }

    static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] < array[j]) {
                    swap(array, j, j - 1);
                }
            }
        }
    }

    static void swap (int[]array, int left, int right){
        if (left != right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
    }
}