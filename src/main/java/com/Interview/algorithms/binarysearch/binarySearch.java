package com.Interview.algorithms.binarysearch;

public class binarySearch {

    public static void main(String[] args){
        int[] array = new int[]{1,2,3,4,5,6,7,8};
        for (int value: array){
            System.out.println(value);
        }

        System.out.print("index of given node is: " + binarySearch(array,5));


    }

    public static int binarySearch(int[] arr, int num){
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(arr[mid] == num)
                return mid;

            if(arr[mid] < num)
                left = mid+1;
            else{
                right = mid-1;
            }
        }
        return -1;
    }
}
