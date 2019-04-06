package com.iliabvf.javacore.chapter06;

/* В  данном примере программы для инициализации размеров параллелепипеда в  классе Вох применяется конструктор */
class Вох6 {
    double width;
    double height;
    double depth;

    // Это конструктор класса Вох
    Вох6() {
        System.out.println("Koнcтpyиpoвaниe объекта Вох");
        width = 10;
        height = 10;
        depth = 10;
        }
    // рассчитать и  возвратить объем
    double volume() {
        return width * height * depth;
    }
}
class  BoxDemo6 {
    public static void main(String args[]) {
        // объявить,   выделить память и  инициализировать объекты типа Вох
        Вох6 myboxl = new Вох6();
        Вох6 mybox2 = new Вох6();
        double vol;
        //получить объем первого параллелепипеда
        vol = myboxl.volume();
        System.out.println("Oбъeм равен" + vol);
        //получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Oбъeм равен" + vol);
    }
}
