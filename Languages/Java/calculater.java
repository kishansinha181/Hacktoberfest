package com.sonal;

import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        char ch= '+';

        while((ch!='x') || (ch!='X')) {

            int N1=0, N2=0;

            ch = s.next().charAt(0);

            if((ch=='+') || (ch=='-') || (ch=='*') || (ch=='/') ||(ch=='%')) {
                N1 = s.nextInt();
                N2 = s.nextInt();


                if (ch == '+') {
                    int sum = N1 + N2;
                    System.out.println(sum);
                } else if (ch == '-') {
                    int diff = N1 - N2;
                    System.out.println(diff);
                } else if (ch == '*') {
                    int pro = N1 * N2;
                    System.out.println(pro);
                } else if (ch == '/') {
                    int quo = N1 / N2;
                    System.out.println(quo);
                } else if (ch == '%') {
                    int rem = N1 % N2;
                    System.out.println(rem);
                }
            }

            else if((ch=='x') || (ch=='X')){
                System.exit(0);
            }
            else{
                System.out.println("Invalid operation. Try again.");
            }

        }

    }
}
