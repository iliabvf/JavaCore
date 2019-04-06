package com.iliabvf.javacore.chapter06;

class BoxDemo2 {
    public static void main(String args[]) {
        Вох myboxl = new Вох();
        Вох mybox2 = new Вох();
        double vol;
        // присвоить значения переменным экземпляра myboxl
        myboxl.width = 10;
        myboxl.height = 20;
        myboxl.depth = 15;
        //* присвоить другие значения  переменным экземпляра шуЬох2 */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        // рассчитать объем первого параллелепипеда
        vol = myboxl.width * myboxl.height * myboxl.depth;
        System.out.println("Oбъeм равен" + vol);
        // рассчитать объем второго параллелепипеда
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Oбъeм равен" + vol);
    }
}