package com.iliabvf.javacore.chapter07;

// Использовать аргументы переменной длины вместе
// со стандартными аргументами
class VarArgs2 {
    // В  данном  примере шsg -обычный параметр,
    // а v -параметр переменной  длины
    static void vаTest(String msg, int... v) {
        System.out.print(msg + v.length + "Содержимое:   ");
        for (int x : v) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        vаTest("Один параметр переменной длины:   ", 10);
        vаTest("Tpи параметра переменной длины:   ", 1, 2, 3);
        vаTest("Бeз параметров переменной длины:   ");
    }
}