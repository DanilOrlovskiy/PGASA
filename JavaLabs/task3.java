package com.company;

import java.util.Scanner;

public class task3 {

    public void performance() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a ");
        double a = in.nextFloat();
        System.out.print("Введите b ");
        double b = in.nextFloat();
        System.out.print("Введите c ");
        double c = in.nextFloat();
        System.out.print("Введите d ");
        double d = in.nextFloat();
        double S = (Math.sqrt(1 + Math.pow(Math.max(a,b), 2)))/((Math.max(a,b) / Math.min(c,d)) + Math.sqrt(1 + Math.pow(Math.max(a,b),2)));
        System.out.print("S = " + S);
    }
}
