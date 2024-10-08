package com.Interview.algorithms.Sorting;

public class SelectionSort {

    public static void main(String[] args){
        int[] array = {12, 11, 13, 5, 6, 7};
//        for (int value: array){
//            System.out.println(value);
//        }

        System.out.println("After sorting");
        selectionSort(array);
        for (int value: array){
            System.out.println(value);
        }
    }

    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i =0 ;i< n-1 ;i++){
            int min = i;
            for(int j = i+1; j< n; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
                int temp = arr[min];
                arr[min] =arr[i];
                arr[i] = temp;
            }
        }
    }

