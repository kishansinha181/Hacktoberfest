package com.sonal;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionsort(int ar[]){

        int l=ar.length;

        for (int i = 0; i <l-1; i++) {

            for(int j=i+1; j>0; j--){

                if(ar[j]<ar[j-1]){
                    int k=ar[j];
                    ar[j]=ar[j-1];
                    ar[j-1]=k;
                }
            }
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

        insertionsort(ar);
    }
}
