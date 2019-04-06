package com.iliabvf.javacore.chapter07;

// Продемонстрировать некоторые методы  из класса Strinq
class  StringDemo2 {
    public static void main(String args[]) {
        String strOb = "Первая строка";
        String strOb2 = "Вторая строка";
        String strObЗ = strOb;
        System.out.println("Длинa строки strOЫ :   " + strOb.length());
        System.out.println("Cимвoл по индексу 3  в строке strOЫ :   " + strOb.charAt(3));
        if (strOb.equals(strOb2))
            System.out.println("strOb = str0b2");
        else
            System.out.println("strOЫ != str0b2");

        if (strOb.equals(strObЗ))
            System.out.println("strOb = strObЗ");
        else
            System.out.println("strOb != strObЗ");
    }
}