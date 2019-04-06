package com.iliabvf.javacore.chapter06;

/* В  данном  примере программы для инициализации размеров параллелепипеда в  классе Вох применяется параметризированный конструктор */ 
class Вох7 {
    double width;
    double height;
    double depth;

    // Это конструктор класса Вох
    Вох7(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // рассчитать и  возвратить объем
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo7 {
    public static void main(String args[]) {
        // объявить,   выделить память и  инициализировать объекты  типа Вох
        Вох7 myboxl = new Вох7(10, 20, 15);
        Вох7 mybox2 = new Вох7(3, 6, 9);
        double vol;
        // nолучить объем первого параллелепипеда
        vol = myboxl.volume();
        System.out.println("Oбъeм равен" + vol);
        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Oбъeм равен" + vol);
    }
}