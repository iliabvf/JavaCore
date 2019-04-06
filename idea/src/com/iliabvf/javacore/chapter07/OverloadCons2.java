package com.iliabvf.javacore.chapter07;

// В  этой  версии класса Вох один объект допускается
// инициализировать другим  объектом
class Вох2 {
    double width;
    double height;
    double depth;

    // Обратите  внимание на этот конструктор .
    // В  качестве параметра в  нем  используется объект  типа Вох
    Вох2(Вох2 ob) {
        // передать объект конструктору 
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор,  используемый при  указании всех размеров
    Вох2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор,  используемый, если ни  один из размеров не указан
    Вох2() {
        width = -1;
        height = -1;
        depth = -1;
    }
    // использовать значение -1 для обозначения
    // неинициализированного // параллелепипеда


    // конструктор,  используемый при создании куба
    Вох2(double len) {
        width = height = depth = len;
    }

    // рассчитать и  возвратить объем
    double volume() {
        return width * height * depth;
    }
}

class OverloadCons2 {
    public static void main(String args[]) {
        // создать параллелепипеды, используя // разные конструкторы
        Вох2 myboxl = new Вох2(10, 20, 15);
        Вох2 mybox2 = new Вох2();
        Вох2 mycube = new Вох2(7);
        Вох2 myclone = new Вох2(myboxl);

        // создать копию объекта JDYЬoxl
        double vol;
        // получить объем первого параллелепипеда
        vol = myboxl.volume();
        System.out.println("Oбъeм myboxl равен" + vol);
        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Oбъeм mybox2 равен" + vol);
        // получить объем куба
        vol = mycube.volume();
        System.out.println("Oбъeм куба равен" + vol);
        // получить объем клона
        vol = myclone.volume();
        System.out.println("Oбъeм клона равен" + vol);
    }
}