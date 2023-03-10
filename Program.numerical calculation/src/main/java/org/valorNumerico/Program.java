package org.valorNumerico;

import util.Calculator;

import java.util.Scanner;

public class Program {


    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
       // instantiating an Object that is in the calculating class//
        Calculator calc= new Calculator();
        System.out.println("Enter Radius");
        double radius= sc.nextDouble();

        double c = calc.circumference(radius);
        double v = calc.volume(radius);
        System.out.printf("circumference %.2f%n", c);
        System.out.printf("volume %.2f%n",v);
        System.out.printf("PI  Value:%.2f%n", calc.PI);




        sc.close();
    }


}