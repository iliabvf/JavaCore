package com.iliabvf.javacore.chapter05;

public class BreakLoop {

    // Применение оператора break для выхода из цикла
    public static void main (String args[]) {
        for( int i=0; i<100; i++)   {
            if (i == 10) break; // выход из цикла, если значение 11 переменной i равно 10
            System.out.println("i: "+ i);
        }
            System.out.println("Цикл завершен.");

        }
    }
