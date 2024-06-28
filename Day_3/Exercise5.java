package com.example.javalib;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner sc  =new Scanner(System.in);
        System.out.print("Enter String here: ");
        String s = sc. nextLine();
        char[] c  = s.toCharArray();
        for(int i =c.length-1;i>=0;i--){
            System.out.print(c[i]);
        }




    }
}
