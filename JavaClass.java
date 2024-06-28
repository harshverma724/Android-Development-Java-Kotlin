package com.example.javalib;

import java.util.Scanner;

class Methods{
    public void division(int a,int b){
        System.out.println("Division of "+a+" and "+b+" is "+a/b);
    }
    public void remainder(int a,int b){
        System.out.println("Remainder of "+a+" and "+b+" is "+a%b);
    }

}

public class JavaClass {
    public static  void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter num 1 here: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num 2 here: ");
        int num2 = sc.nextInt();

        Methods m = new Methods();
        m.division(num1,num2);
        m.remainder(num1,num2);



    }
}