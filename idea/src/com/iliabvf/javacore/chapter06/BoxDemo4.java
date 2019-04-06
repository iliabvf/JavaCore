package com.iliabvf.javacore.chapter06;

// Теперь метод volume() возвращает объем параллелепипеда 
class Вох {
    double width;
    double height;
    double depth;

    // рассчитать и  возвратить объем
    double volume() {
        return width * height * depth;
    }
}

class  BoxDemo4 {
    public static void main(String args[]) {
        Вох myboxl = new Вох();
        Вох mybox2 = new Вох();
        double vol;
        // присвоить значения переменным экземпляра шуЬохl
        myboxl.width = 10;
        myboxl.height = 20;
        myboxl.depth = 15;
        /* присвоить другие значения переменным экземпляра шуЬох2 */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        // получить объем первого параллелепипеда
        vol = myboxl.volume();
        System.out.println("Oбъeм равен" + vol);
        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Oбъeм равен" + vol);
    }
}