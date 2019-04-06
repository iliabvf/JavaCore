package com.iliabvf.javacore.chapter07;

class RecTest {
    int values[];

    RecTest(int i) {
        values = new int[i];
    }
        // вывести рекурсивно элементы массива
        void printArray ( int i){
            if (i == 0)
                return;
            else
                printArray(i - 1);
            System.out.println("[" + (i - 1) + "] " + values[i - 1]);
        }

}

class Recursion2 {
    public static void main(String args[]) {
        RecTest оЬ = new RecTest(10);
        int i;
        for (i = 0; i < 10; i++)
            оЬ.values[i] = i;
        оЬ.printArray(10);
    }
}