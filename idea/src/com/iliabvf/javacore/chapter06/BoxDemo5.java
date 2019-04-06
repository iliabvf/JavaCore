package com.iliabvf.javacore.chapter06;

class Вох5 {
    double width;
    double height;
    double depth;

    // рассчитать и  возвратить объем
    double volume() {
        return width * height * depth;
    }

    // установить размеры параллелепипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

class BoxDemoS {
    public static void main(String args[]) {
        Вох5 myboxl = new Вох5();
        Вох5 mybox2 = new Вох5();
        double vol;
        // инициализировать каждый экземпляр класса ВОх
        myboxl.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);
        // получить объем первого параллелепипеда
        vol = myboxl.volume();
        System.out.println("Объeм равен " + vol);
        // получить объем второго  параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объeм равен " + vol);
    }
}