package com.iliabvf.javacore.chapter07;

//  Продемонстрировать перегрузку ме тодов 
class OverloadDemo {
    void test() {
        System.out.println("Пapaмeтpы отсутствуют");
    }

    // Перегружаемый  метод,   проверяющий наличие 
    // одного целочисленного параметра 
    void test(int a) {
        System.out.println("a: " + a);
    }

    // Перегружаемый метод, проверяющий наличие
    // двух целочисленных  параметров 
    void test(int a, int b) {
        System.out.println("a и  Ь: " + a + "" + b);
    }

    // Перегружаемый метод,   проверяющий наличие
    // параметра типа double
    double test(double a) {
        System.out.println("double  а: " + a);
        return a * a;
    }
}

class Overload{
    public static void main (String args[])   { 
        OverloadDemo od = new OverloadDemo(); 
        double result; 
        // вызвать все варианты метода teвt() 
        od.test();
        od.test(10);
        od.test(10, 20);
        result = od.test(123.25);
        System.out.println("Peзyльтaт вызова od .test(123.25}:   "+ result);
    }
}
