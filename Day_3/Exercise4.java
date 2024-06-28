package com.example.javalib;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        int num = 0,letter = 0,spaces = 0,others = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String here: ");

        String s = sc.nextLine();

        char[] c  =s.toCharArray();

        for(int i = 0;i<s.length();i++){

            if(Character.isLetter(c[i])){
                letter++;


            }else if(Character.isDigit(c[i])){
                num++;


            }else if(Character.isSpaceChar(c[i])){
                spaces++;


            }else{
                others++;
            }

        }

        System.out.println("Letters: "+letter);
        System.out.println("Spaces: "+spaces);
        System.out.println("Digits: "+num);
        System.out.println("Others: "+others);




    }
}
