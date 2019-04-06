package com.iliabvf.javacore.chapter08;

// Динамическая диспетчеризация методов
class А5 {
    void callme() {
        System.out.println("B  методе callme() из класса А");
    }
}

class B5 extends А5 {
    // переопределить метод callшe()
    void callme() {
        System.out.println("B  методе callme ()  из класса В");
    }
}

class С5  extends А5 {
    // переопределить метод callllle ()
    void callme() {
        System.out.println("B  методе callrne() из класса С");
    }
}

class Dispatch {
    public static void main(String args[]) {
        А5 а = new А5(); // объект класса А в
        B5 b = new B5(); // объект класса в
        С5 c = new С5(); // объект класса с А r;
        // получить ссылку на объект типа
        А5 r = а; // переменная r ссылается на объект
        r.callme(); // вызвать вариант метода callllle () ,
        // определенный в  классе А
        r = b; // переменная r ссылается на объект
        r.callme(); // вызвать вариант метода callllle (),
        // определенный в  классе В
        r = c; // переменная r ссылается на объект
        r.callme();
        // вызвать вариант ме тода callшe() ,
        // определенный в  классе С
    }
}