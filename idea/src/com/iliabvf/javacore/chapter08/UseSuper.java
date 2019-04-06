package com.iliabvf.javacore.chapter08;

// Использовать ключевое слово super с  целью предотвратить сокрытие имен
class А2 {
    int i;
}

// создать подкласс путем расширения  класса А
class  В2 extends А2 {
    int i; // этот член i скрывает член i из класса А

    В2(int а, int Ь) {
        super.i = а;
    }

    // член i из класса А i  = Ь;
    // член i из класса В
    void show() {
        System.out.println("Члeн i  в суперклассе:   " + super.i);
        System.out.println("Члeн i  в подклассе :   " + i);
    }
}

class UseSuper {
    public static void main(String args[]) {
        В2 subOb = new В2(1, 2);
        subOb.show();
    }
}
