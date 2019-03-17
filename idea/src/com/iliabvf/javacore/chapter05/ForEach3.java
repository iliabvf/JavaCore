package com.iliabvf.javacore.chapter05;

public class ForEach3 {
    
    // Применение цикла for в  стиле for each для 11 0бращения к  двухмерн0му массиву 
    public static void main (String args[]) {
        int sum = 0;
        int nums[][] = new int[3][5];
        // присв0ить значение элементам  массива DUlllS 
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                nums[i][j] = (i + 1) * (j + 1);

        // исп0льз0вать цикл for в  стиле for  each для 11 выв0да и  суммир0вания значений
        for (int х[] : nums) {
            for (int у : х) {
                System.out.println("Знaчeниe равн0:   " + у);
                sum += у;
            }
        }
        System.out.println("Cyммa :   " + sum);
    }
}
