package com.iliabvf.javacore.chapter08;

// Полная реализация класса BoxWeight3
class Box2 {
    private double width;
    private double height;
    private double depth;

    // сконструировать клон объекта
    Box2(Box2 ob) {
        //передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор , применяемый при указании всех размеров
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }


    // конструктор, применяемый  в отсутствие размеров  
    Box2() {
        width = -1;
        height = -1;
        depth = -1; // значение -1 служит для  обозначения // неинициализированного // параллелепипеда
    }

    // конструктор,   применяемый при создании куба
    Box2(double len) {
        width = height = depth = len;
    }

    // рассчитать и  возвратить объем
    double volume() {
        return width * height * depth;
    }
}

    //Теперь в  классе ВOxWeight полностью реализованы  все конструкторы
class BoxWeight3 extends Box2 {
    double weight;

    // вес параллелепипеда // сконструировать клон объекта
    BoxWeight3(BoxWeight3 ob) {
        //  передать объект конструктору
        super(ob);
        weight = ob.weight;
    }

    // конструктор , применяемый  при указании всех параметров
    BoxWeight3(double w, double h, double d, double m) {
        super(w, h, d);
        //вызвать конструктор  из суперкласса
        weight = m;
    }

    // конструктор,   применяемый по умолчанию
    BoxWeight3() {
        super();
        weight = -1;
    }

    // конструктор,   применяемый при создании куба
    BoxWeight3(double len, double m) {
        super(len);
        weight = m;
    }
}


class DemoSuper {
    public static void main(String args[]) {
        BoxWeight3 myBoxl = new BoxWeight3(10, 20, 15, 34.3);
        BoxWeight3 myBox2 = new BoxWeight3(2, 3, 4, 0.076);
        BoxWeight3 myBox3 = new BoxWeight3();
        //по умолчанию
        BoxWeight3 mycube = new BoxWeight3(3, 2);
        BoxWeight3 myclone = new BoxWeight3(myBoxl);
        double vol;
        vol = myBoxl.volume();
        System.out.println("Oбъeм myBoxl  равен" + vol);
        System.out.println("Bec myBoxl  равен" + myBoxl.weight);
        System.out.println();
        vol = myBox2.volume();
        System.out.println("Oбъeм myBox2 равен" + vol);
        System.out.println("Bec myBox2 равен" + myBox2.weight);
        System.out.println();
        vol = myBox3.volume();
        System.out.println("Oбъeм myBox3 равен" + vol);
        System.out.println("Bec myBox3 равен" + myBox3.weight);
        System.out.println();
        vol = myclone.volume();
        System.out.println("Oбъeм myclone равен" + vol);
        System.out.println("Bec myclone равен" + myclone.weight);
        System.out.println();
        vol = mycube.volume();
        System.out.println("Oбъeм mycube равен" + vol);
        System.out.println("Bec mycube равен" + mycube.weight);
        System.out.println();
    }
}