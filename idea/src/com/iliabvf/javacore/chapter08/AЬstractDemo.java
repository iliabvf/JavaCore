package com.iliabvf.javacore.chapter08;

// Простой  пример абстракции
abstract class A6 {
    abstract void callme();

    // абстрактные классы  все же могут содержать конкретные методы
    void callmetoo() {
        System.out.println("Этo конкретный метод.");
    }
}

class В6  extends A6 {
    void callme() {
        System.out.println("Peaлизaция метода callme() из класса В.");
    }
}

class AЬstractDemo {
    public static void main(String args[]) {
        В6 b = new В6();
        b.callme();
        b.callmetoo();
    }
}