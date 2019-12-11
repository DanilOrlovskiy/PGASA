package com.company;

import java.util.Scanner;

public class task4 {

    public void performance() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x ");
        float x = in.nextFloat();
        int Nx = x < 0.5 ? 0 : x < 1.5 ? 1 : x < 2.5 ? 2 : x < 3.5 ? 3 : 4;
        System.out.print(Nx);
    }
}
