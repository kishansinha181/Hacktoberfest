package com.sonal;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static int maxindex(int ar[], int start, int end){

        int max=0;

        for (int i = start; i < end; i++) {

            if(ar[i]>ar[max]){
                max=i;
            }
        }
        return max;
    }

    public static void selectionsort(int ar[]){

        for (int i = 0; i < ar.length; i++) {

            int max=maxindex(ar, 0, ar.length-i);

            int k=ar[max];
            ar[max]=ar[ar.length-1-i];
            ar[ar.length-1-i]=k;
        }
        System.out.println(Arrays.toString(ar));

    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int ar[] = new int[N];

        System.out.println("ENTER FIRST ARRAY");
        for (int i = 0; i < N; i++) {

            ar[i] = s.nextInt();

        }

        selectionsort(ar);
    }

}
