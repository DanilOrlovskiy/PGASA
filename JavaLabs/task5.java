package com.company;

import java.util.Scanner;

public class task5 {

    public void performance(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x ");

        int x = in.nextInt();
        int Z = 0;

        for(int i = 1; i<=3; i++) {
            Z += (Math.pow(x,2*i-1))/(2*(i+3));
        }
        System.out.print("Z =  " + Z);
    }
}
