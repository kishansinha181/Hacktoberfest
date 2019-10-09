package com.sonal;

import java.util.Scanner;

public class Palindrome {
    public static boolean palindrome(String s){

        int k=0;
        for (int i = 0; i < s.length()/2; i++) {

            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                k=1;
                break;
            }
        }

        if(k==1){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String string = s.next();
        System.out.println(palindrome(string));
    }
}
