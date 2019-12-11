package com.company;

import java.util.Scanner;

public class task6 {

    public void performance(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x ");

        int x = in.nextInt();
        int S = 0;

        for(int j = 2; j<=14; j+=2) {

            for(int n = 1; n<=20; n++){
                S += (Math.pow(x,n)+j)/n;
            }
        }
        System.out.print("S =  " + S);
    }
}
