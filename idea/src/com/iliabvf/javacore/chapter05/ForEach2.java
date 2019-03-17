package com.iliabvf.javacore.chapter05;

public class ForEach2 {
    // Применение оператора break в  цикле for в  стиле for each
    public static void main (String args[])   {
        int sum  = 0;
        int nurns[]  =  { 1, 2, 3, 4 , 5, 6, 7, 8, 9, 10 } ;
        // использовать цикл for в  стиле for each для 11  вывода и  суммирования значений из части  массива
        for(int x  : nurns) {
            System.out.println("Знaчeниe равно:   " + x);
            sum += x;
            if (x == 5) break;
        }
            // прервать цикл после 11 получения 5 значений
            System.out.println("Cyммa пяти первых элементов равна:   " + sum);
    }
}
