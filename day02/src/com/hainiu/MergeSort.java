package com.hainiu;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);

    }

    public static void mergeSort(int[] arr) {
        int[] tempArr = new int[arr.length];
        mergeSort(arr, tempArr, 0, arr.length - 1);
        System.out.println(Arrays.toString(tempArr));

    }

    public static void mergeSort(int[] arr, int[] tempArr, int start, int end) {
        if (start < end){
            int mid = (start + end) / 2;
            mergeSort(arr, tempArr, start, mid);
            mergeSort(arr, tempArr, mid + 1, end);
            int leftpos = start;
            int leftend = mid;
            int rightpos = mid + 1;
            int rightend = end;

            int elementNum = rightend - leftpos + 1;
            int tempindex = leftpos;
            while (leftpos <= leftend && rightpos <= rightend){
                if (arr[leftpos] <= arr[rightpos]){
                    tempArr[tempindex++] = arr[leftpos++];
                }else {
                    tempArr[tempindex++] = arr[rightpos++];
                }
            }
            while (leftpos <= leftend){
                tempArr[tempindex++] = arr[leftpos++];
            }
            while (rightpos <= rightend){
                tempArr[tempindex++] = arr[rightpos++];
            }
            for (int i = 0; i < elementNum; i++,rightend--) {
                arr[rightend] = tempArr[rightend];
            }
        }
    }
}
