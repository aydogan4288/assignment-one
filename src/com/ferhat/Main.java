package com.ferhat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Type a number");


        // Numerical input
        int input = myObj.nextInt();

        printStars(input);
        printReverse(input);
        printPyramid(input);
        printReversePyramid(input);
    }

    public static void printStars(int input){

        System.out.println("PRINT STARS");
        int i, j;

        for(i=0; i<input; i++)
        {

            for(j=0; j<=i; j++)
            {

                System.out.print("* ");
            }

            System.out.println();
        }


    }

    public static void printReverse(int input){
        System.out.println("REVERSE PRINT STARS");
        int i,j;

        for (i=0; i<input; i++){

            for(j=2*(input-i); j>=0; j--){
                System.out.print(" ");
            }

            for(j=0; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    public static void printPyramid(int input){
        System.out.println("PYRAMID STARS");
        int i,j;

        for(i = 0; i<input; i++){

            for(j = input-i; j>=0; j--){
                System.out.print(" ");
            }

            for(j=0; j<=i; j++){
                System.out.print("* ");
            }


            System.out.println();
        }

    }

    public static void printReversePyramid(int input){
        System.out.println("REVERSE PYRAMID STARS");
        int i,j;

        for(i = 0; i<input; i++){

            for(j=0; j<=i; j++){
                System.out.print(" ");
            }

            for(j = input-i; j>0; j--){
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
