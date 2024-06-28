package com.example.javalib;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num[] = new int[100] ;
        int decimal,i=1,j;

        System.out.print("Enter Decimal no. here: ");
        decimal = sc.nextInt();

       while(decimal != 0){

            num[i++]=decimal%2;
            decimal = decimal/2;

        }

        System.out.println("Binary no: ");

        for(j =i-1 ; j>0;j--){
            System.out.print(num[j]);
        }


    }
}
