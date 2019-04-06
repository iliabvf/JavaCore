package com.iliabvf.javacore.chapter06;

class BoxDemo3{
    public static void main(String args[]) {
        Вох mybox1 = new Вох();
        Вох mybox2 = new Вох();
        // присвоить значение переменным экземпляра JIYЬoxl
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        /* присвоить другие значения переменным экземпляра .iytюx2 экземпляра mybox2 */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        // вывести объем первого параллелепипеда
        mybox1.volume();
        // вывести объем второго параллелепипеда
        mybox2.volume();
    }
}
