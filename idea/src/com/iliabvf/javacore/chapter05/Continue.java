package com.iliabvf.javacore.chapter05;

public class Continue {

    // Продемонстрировать применение оператора continue
    public static void main (String  args[]) {
        for(int i=0;  i<10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) continue;
            System.out.println("");
        }
        }
    }
