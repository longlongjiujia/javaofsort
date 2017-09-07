package com.zyl;

/**
 *冒泡排序
 */
public class BubbleSort {

    private static void bubblesort(int[] tup){
        for (int i = 0; i < tup.length - 1; i++) {
            for (int j = 0; j < tup.length - i - 1; j++) {
                if(tup[j] > tup[j+1]){
                    int temp = tup[j];
                    tup[j] = tup[j+1];
                    tup[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] tup = {5,2,45,6,8,2,1};
        bubblesort(tup);
        for (int i = 0; i < tup.length; i++) {
            System.out.println(tup[i]);
        }
    }
}
