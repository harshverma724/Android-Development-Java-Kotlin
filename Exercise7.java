package com.example.javalib;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        int odd = 0;
        int even = 0;

        for(int i=0;i<=arr.length-1;i++){
            System.out.print("Enter element "+ (i+1) +" here: ");
            arr[i] = sc.nextInt();
            if(arr[i]%2 != 0){
                odd++;

            }else{
                even++;
            }
        }
        System.out.print("Array Elements: ");
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Odds: "+odd);
        System.out.println("Even: "+even);





    }
}
