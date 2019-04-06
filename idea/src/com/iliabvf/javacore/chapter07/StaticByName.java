package com.iliabvf.javacore.chapter07;

class StaticDemo {
    static int а = 42;
    static int b = 99;

    static void callme() {
        System.out.println("a = " + а);
    }
}

class StaticByName {
        public static void main(String args[]) {
        StaticDemo.callme();
        System.out.println("b = " + StaticDemo.b);
    }
}