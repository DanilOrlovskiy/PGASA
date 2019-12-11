package com.company;

public class task8 {

    public void performance(){
        double a = 4.6;
        for(double x = 3; x <= 5; x+=0.2){
            System.out.print("\nr(x)= " + (x <= a ? Math.sin(Math.pow(x,2))/(1+Math.sqrt(x)) : Math.pow(x,2)/(1 + Math.sqrt(x))));
        }
        System.out.print("\nEnd");
    }
}
