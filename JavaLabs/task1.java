package com.company;

import java.util.Scanner;

public class task1 {

    public void performance(){
    Scanner in = new Scanner(System.in);

    double s1 = 0, s2 = 0, s = 0;
     System.out.print("Введите Точки x1, y2, y1");
    float x1 = in.nextFloat();
    float y1 = in.nextFloat();
    float z1 = in.nextFloat();
    System.out.print("Введите Точки x2, y2, y2");
    float x2 = in.nextFloat();
    float y2 = in.nextFloat();
    float z2 = in.nextFloat();
    System.out.print("Введите A, B, C, D");
    float a = in.nextFloat();
    float b = in.nextFloat();
    float c = in.nextFloat();
    float d = in.nextFloat();

    s1= (Math.abs(a*x1+b*y1+c*z1+d))/(Math.sqrt(a*a+b*b+c*c));
    s2= (Math.abs(a*x2+b*y2+c*z2+d))/(Math.sqrt(a*a+b*b+c*c));
    s=s1+s2;
        System.out.print("Сумма расстояний от точек x1, y2, y1 и x2, y2, y2 до плоскости Ax + By + Cz + D=0: \n " + s);
    }
}
