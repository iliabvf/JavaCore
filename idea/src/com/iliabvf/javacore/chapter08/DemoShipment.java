package com.iliabvf.javacore.chapter08;

// Расширение класса BoxWeiqht включением в  него 
// поля стоимости доставки 
// создать сначала класс Box 
class Box {
    private double width;
    private double height;
    private double depth;

    // сконструировать клон объекта 
    Box(Box ob) {
        // передать объект конструктору 
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор,   применяемый при указании всех размеров 
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, применяемый в  отсутствие размеров  
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // значение -1 служит  для обозначения // неинициализированного // параллелепипеда 
    // конструктор,   применяемый при создании куба 
    Box(double len) {
        width = height = depth = len;
    }

    // рассчитать и  возвратить объем 
    double volume() {
        return width * height * depth;
    }
}    
    
// добавить поле веса 
class BoxWeight2 extends Box {
    double weight;   // вес параллелепипеда

    // сконструировать клон объекта 
    BoxWeight2(BoxWeight2 ob) {
        // передать объект конструктору 
        super(ob);
        weight = ob.weight;
    }

    // конструктор, применяемый при указании всех параметров 
    BoxWeight2(double w, double h, double d, double m) {
        super(w, h, d);
        // вызвать конструктор суnеркласса
        weight = m;
    }

    // конструктор,   применяемый по умолчанию
    BoxWeight2() {
        super();
        weight = -1;
    }

    // конструктор,   применяемый при создании куба
    BoxWeight2(double len, double m) {
        super(len);
        weight = m;
    }
}

// добавить поле стоимости доставки
class  Shipment extends BoxWeight2 {
    double cost;

    // сконструировать клон объекта
    Shipment(Shipment ob) {
        //передать объект конструктору
        super(ob);
        cost = ob.cost;
    }

    // конструктор,   используемый при указании всех параме тров
    Shipment(double w, double h, double d, double m, double с) {
        super(w, h, d, m);
        //вызвать конструктор суперкласса
        cost = с;
    }

    // конструктор,   применяемый по умолчанию
    Shipment() {
        super();
        cost = -1;
    }

    // конструктор , применяемый при создании куба
    Shipment(double len, double m, double с) {
        super(len, m);
        cost = с;
    }
}

class DemoShipment {
    public static void main(String args[]) {
        Shipment shipmentl = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;
        vol = shipmentl.volume();
        System.out.println("Oбъeм shipmentl  равен" + vol);
        System.out.println("Bec shipmentl  равен " + shipmentl.weight);
        System.out.println("Cтoимocть доставки : $" + shipmentl.cost);
        System.out.println();
        vol = shipment2.volume();
        System.out.println("Oбъeм shipment2 равен" + vol);
        System.out.println("Bec shipment2 равен " + shipment2.weight);
        System.out.println("Cтoимocть доставки : $ " + shipment2.cost);

    }

}
