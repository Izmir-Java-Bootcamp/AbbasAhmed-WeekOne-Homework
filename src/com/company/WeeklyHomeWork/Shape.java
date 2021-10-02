package com.company.WeeklyHomeWork;

import java.util.Scanner;

public class Shape {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int number = in.nextInt();

        DrawShape(number);

    }

    public static void DrawShape(int n){

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < n-2; i++) {
            System.out.print("*");
            for (int j = 0; j < n-2; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();


    }
}


