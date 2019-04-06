package com.iliabvf.javacore.chapter09;

interface MyIF {
    // Это объявление  обычного метода в  интерфейсе.
    // Он НЕ предоставляет реализацию по умолчанию
    int getNumЬer();

    // А это объявление метода по умолчанию .  Обратите
    // внимание на его реализацию по умолчанию
    default String getString() {
        return "Объект типа String  по умолчанию";
    }
}

// Реализовать интерфейс МyIF
class MyIFimp  implements MyIF {
    // В  этом классе должен быть реализован только метод qe tNuJllЬer(),
    // определенный в  интерфейсе МyIF.
    // А вызов метода qetStrinq()  разрешается по умолчанию
    public int getNumЬer() {
        return 100;
    }
}

public class DefaultMethodDemo {
    public static void main(String args[]) {
        MyIFimp obj = new MyIFimp();
        //  Метод qetNWllЬer()  можно вызвать,   т.к. он явно реализован
        // в  классе МyIFimp:
        System.out.println(obj.getNumЬer());
        // Метод getStrinq() также можно  вызвать, т.к. в  интерфейсе
        // имеется его реализация по умолчанию:
        System.out.println(obj.getString());
    }
}

