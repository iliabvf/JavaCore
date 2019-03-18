package com.iliabvf.javacore.chapter05;

public class BreakLoop3 {

    // Применение оператора break во вложенных циклах
    public static void main(String args[]) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Пpoxoд  " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break; //выход из цикла,   значение 11 переменной j  равно 10
                System.out.print(j + " ");
            }
            System.out.println();
            System.out.println("Циклы завершены.");

        }

    }

}