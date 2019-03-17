package com.iliabvf.javacore.chapter04;

public class NoBody {

    public static void main(String[] args) {
        // Целевая часть цикла может  быть пустой
        int i, j;
        i = 100;
        j = 200;
        // рассчитать среднее значение переменных i и  j
        while(++i <  --j); // у  этого цикла отсутствует  тело
        System.out.println("Cpeднee  значение равно" + i);
    }
}
