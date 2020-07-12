package com.viju;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int a,b;
	float c,d;
	Scanner input = new Scanner(System.in);
    System.out.println("Please enter two integer numbers");
    a = input.nextInt();
    b = input.nextInt();
    System.out.println("Please enter two floating point numbers");
    c = input.nextFloat();
    d = input.nextFloat();
    System.out.println("");
    System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
    System.out.println("Difference between "+a+" and "+b+" is "+(a-b));
    System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
    System.out.println("Division of "+a+" and "+b+" is "+(a/b));
    System.out.println("");
    System.out.println("Sum of "+c+" and "+d+" is "+(c+d));
    System.out.println("Difference between "+c+" and "+d+" is "+(c-d));
    System.out.println("Multiplication of "+c+" and "+d+" is "+(c*d));
    System.out.println("Division of "+c+" and "+d+" is "+(c/d));
    System.out.println("");
    System.out.println("Now let us see pre-increment and post-increment operators");
    int e;
    System.out.println("Enter one integer number");
    e = input.nextInt();
    System.out.println("You have entered "+e+".In this line, the value of pre-increment variable is "+(++e)+".The value of post-increment variable is "+(e++));
    }
}
