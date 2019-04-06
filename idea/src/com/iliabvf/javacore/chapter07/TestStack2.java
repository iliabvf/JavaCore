package com.iliabvf.javacore.chapter07;

// Усовершенствованный класс Stack, в  котором
// использован член  длины массива
class Stack {
    private int stck[];
    private int tos;

    // выделить память под стек и  инициализировать его
    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    //разметить элемент в  стеке
    void push(int item) {
        if (tos == stck.length - 1)
            //использовать член длины массива
            System.out.println("Cтeк заполнен.");
        else
            stck[++tos] = item;
    }

    // извлечь элемент  из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Cтeк не загружен. ");
            return 0;
        } else
            return stck[tos--];
    }
}

class TestStack2 {
    public static void main(String args[]) {
        Stack mystackl = new Stack(5);
        Stack mystack2 = new Stack(8);
        // разместить числа в  стеке
        for (int i = 0; i < 5; i++)
            mystackl.push(i);
        for (int i = 0; i < 8; i++)
            mystack2.push(i);
        // извлечь эти  числа из стека
        System.out.println("Cтeк в  mystackl:");
        for (int i = 0; i < 5; i++)
            System.out.println(mystackl.pop());
        System.out.println("Cтeк в  mystack2:");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());
    }
}