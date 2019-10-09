package com.sonal;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int ar[]){

        int l=ar.length;

        for (int i = 0; i < (l/2); i++) {

            int k=ar[i];
            ar[i]=ar[l-1-i];
            ar[l-1-i]=k;
        }
        System.out.println(Arrays.toString(ar));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int ar[] = new int[N];

        System.out.println("ENTER ARRAY");
        for (int i = 0; i <N ; i++) {

            ar[i]=s.nextInt();

        }

        reverse(ar);
    }
}
