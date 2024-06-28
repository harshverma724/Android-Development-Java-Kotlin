package com.example.javalib;

public class Exercise6 {
    public static void main(String[] args) {

        int[] a = {1,2,3,4};
        int[] b = {1,2,3,4};
        int[] c = new int[4];



        for(int i =0;i<=a.length-1;i++){

            c[i] = a[i]*b[i];

        }

        for(int x:c){
            System.out.print(x+" ");
        }



    }
}
