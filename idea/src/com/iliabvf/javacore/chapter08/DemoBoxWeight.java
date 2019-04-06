package com.iliabvf.javacore.chapter08;

// В  этой программе наследование применяется 
// для расширения класса Вох 
class Вох {
    double width;
    double height;
    double depth;

    // сконструировать клон объекта
    Вох(Вох оЬ) {
        //передать объект конструктору
        width = оЬ.width;
        height = оЬ.height;
        depth = оЬ.depth;
    }

    // конструктор , применяемый при указании всех размеров
    Вох(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор применяемый  в отсутствие размеров
    Вох() {
        width = -1;
        height = -1;
        depth = -1;
        // значение -1 служит для обозначения // неинициализированного // параллелепипеда
    }

    // конструктор , применяемый при создании куба
    Вох(double len) {
        width = height = depth = len;
    }

    // рассчитать и  возвратить объем
    double volume() {
        return width * height * depth;
    }
}
    // расширить класс Вох, включив в  него поле веса
class BoxWeight extends Вох {
    double weight;   //вес параллелепипеда

    // конструктор
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class DemoBoxWeight {
    public static void main(String args[]) {
        BoxWeight myboxl = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);

        double vol;

        vol = myboxl.volume();
        System.out.println("Oбъeм myboxl  равен" + vol);
        System.out.println("Bec myboxl  равен" + myboxl.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Oбъeм mybox2 равен" + vol);
        System.out.println("Bec mybox2 равен" + mybox2.weight);
    }
}