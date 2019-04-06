package com.iliabvf.javacore.chapter07;

/* В  данном  примере конструкторы определяются в  классе Вох для инициализации размеров параллелепипеда тремя разными способами */
class Вох {
    double width;
    double height;
    double depth;

    // конструктор , используемый при указании всех размеров 
    Вох(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, используемый , когда ни  один из размеров не указан
    Вох() {
        // использовать значение -1 для обозначения // неинициализированного // параллелепипеда
        width = -1;
        height = -1;
        depth = -1;
    }

    // конструктор,   используемый при создании куба
    Вох(double len) {
        width = height = depth = len;
    }

    // рассчитать и  возвратить объем
    double volume() {
        return width * height * depth;
    }
}

class OverloadCons {
    public static void main(String args[]) {
        // создать параллелепипеды, используя разные
        // конструкторы
        Вох myboxl = new Вох(10, 20, 15);
        Вох mybox2 = new Вох();
        Вох mycube = new Вох(7);
        double vol; // получить объем первого параллелепипеда
        vol = myboxl.volume();
        System.out.println("Oбъeм myboxl равен" + vol);
        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Oбъeм mybox2 равен" + vol);
        // получить объем куба
        vol = mycube.volume();
        System.out.println("Oбъeм mycube равен" + vol);
    }
}