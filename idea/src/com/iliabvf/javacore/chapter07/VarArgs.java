package com.iliabvf.javacore.chapter07;

// Продемонстрировать применение аргументов переменной длины
class VarArgs {
    // теперь метод vaTest() объявляется  с аргументами переменной длины
    static void vaTest(int... v) {
        System.out.print("Koличecтвo аргументов:   " + v.length + "  Содержимое :   ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        // Обратите внимание на возможные способы вызова
        vaTest(10); // метода vaTest() с  аргументами переменной длины
        vaTest(1, 2, 3); // 1 аргумент
        // 3  аргумента
        vaTest(); // без аргументов
    }
}