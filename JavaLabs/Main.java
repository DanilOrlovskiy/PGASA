package com.company;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задания");
        int menu = in.nextInt();

        switch (menu) {
            case (1):
                System.out.println("Задание 1");
                task1 task1Obj = new task1();
                task1Obj.performance();
                break;
            case (2):
                System.out.println("Задание 2");
                task2 task2Obj = new task2();
                task2Obj.performance();
                break;
            case (3):
                System.out.println("Задание 3");
                task3 task3Obj = new task3();
                task3Obj.performance();
                break;
            case (4):
                System.out.println("Задание 4");
                task4 task4Obj = new task4();
                task4Obj.performance();
                break;
            case (5):
                System.out.println("Задание 5");
                task5 task5Obj = new task5();
                task5Obj.performance();
                break;
            case (6):
                System.out.println("Задание 6");
                task6 task6Obj = new task6();
                task6Obj.performance();
                break;
            case (7):
                System.out.println("Задание 7");
                task7 task7Obj = new task7();
                task7Obj.performance();
                break;
            case (8):
                System.out.println("Задание 8");
                task8 task8Obj = new task8();
                task8Obj.performance();
                break;
            case (9):
                System.out.println("Задание 9");
                task9 task9Obj = new task9();
                task9Obj.performance();
                break;
        }
    }
}
