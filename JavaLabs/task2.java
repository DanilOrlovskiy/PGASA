package com.company;

public class task2 {

    public void performance(){

      double a = 2.7;
      double b = 0.4;
      double x = 0.7;
      double t = 0.25;
      double V = Math.sqrt(Math.log(4+b*x))-Math.pow(5,x)+ Math.sin(Math.pow(x,2));
      double Y = Math.asin(Math.sqrt(x))+ a*Math.pow(x,3);
      double Q = 0.5 * 3.14 * Math.pow(t,(1/3)) + Y * Math.pow(Math.cos(a * x), 2);
      double R = ((2.45 - Math.tan(3*x))/(4.9 * Math.pow(10,-2) * Math.log(Math.abs(a*x))))+ Math.pow(2.72,(-1*Math.sin(x))) * Q;

        System.out.print("V = "+ V +"\nY = "+ Y +"\nQ = "+ Q +"\nR = "+ R);
    }
}
