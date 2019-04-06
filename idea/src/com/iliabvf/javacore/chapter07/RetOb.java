package com.iliabvf.javacore.chapter07;

// Возврат объекта
class Test4 {
    int a;

    Test4(int i) {
        a = i;
    }

    Test4 incrByTen() {
        Test4 temp = new Test4(a + 10);
        return temp;
    }
}

class RetOb {
    public static void main(String args[]) {
        Test4 ob = new Test4(2);
        Test4 оЬ2;
        оЬ2 = ob.incrByTen();
        System.out.println("ob.а: " + ob.a);
        System.out.println("ob2 .a: " + оЬ2.a);
        оЬ2 = оЬ2.incrByTen();
        System.out.println("ob2 .a после второго увеличения значения: " + оЬ2.a);
    }
}