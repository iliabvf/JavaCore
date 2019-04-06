package com.iliabvf.javacore.chapter08;

// Продемонстрировать порядок  вызова конструкторов
// создать суперкласс
class А3 {
    А3() {
        System.out.println("B  конструкторе А. ");
    }
}

// создать подкласс путем расширения класса А
class B3  extends А3 {
    B3() {
        System.out.println("B  конструкторе В.");
    }
}

// создать еще  один подкласс путем расширения класса В
class C  extends B3 {
    C() {
        System.out.println("B  конструкторе С.");
    }
}

class CallingCons {
    public static void main(String args[]) {
        C C = new C();
    }
}