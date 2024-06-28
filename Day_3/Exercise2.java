package com.example.javalib;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter radius here: ");
        float radius = sc.nextFloat();

        System.out.println("Area: "+Math.PI*radius*radius);

        System.out.println("Perimeter: "+2*Math.PI*radius);

    }
}
