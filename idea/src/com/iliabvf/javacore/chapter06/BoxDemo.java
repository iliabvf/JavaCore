package com.iliabvf.javacore.chapter06;


/* Программа,  исnользующая класс Вох 
Присвоить исходному файлу имя BoxDeшo.java 
 */

class BoxDemo {
    public static void main(String args[]) {
        Вох mybox = new Вох();
        double vol;
        // присвоить значение  переменным экземпляра mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
        // рассчитать объем параллелепипеда
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Oбъeм равен" + vol);
    }
}

