package com.company;

public class task7 {

    public void performance(){
        double a = 0.36, b = 5.5;
        double y;
        for(double x = 1; x <= 6; x+=0.5){
            y = Math.log(x - b) / a + x;
            System.out.print("\ny: " + y);
        }
        System.out.println("\nEnd");
    }
}
