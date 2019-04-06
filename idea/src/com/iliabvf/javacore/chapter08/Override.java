package com.iliabvf.javacore.chapter08;

// Переопределение метода
class A4 {
    int i, j;

    A4(int а, int Ь) {
        i = а;
        j = Ь;
    }

    // вывести содержимое  переменных i и  j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class В4  extends A4 {
    int k;

    В4(int а, int Ь, int с) {
        super(а, Ь);
        k = с;
    }

    // вывести содержимое  переменной k с  помощью  ме тода,
    // переопределяющего метод show() из класса А
    void show() {
        System.out.println("k: " + k);
    }
}

class Override {
    public static void main(String args[]) {
        В4 subOb = new В4(1, 2, 3);
        subOb.show();
        //здесь вызывается метод show() из класса В
    }
}