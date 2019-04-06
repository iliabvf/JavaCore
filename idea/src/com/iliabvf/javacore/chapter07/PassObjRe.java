package com.iliabvf.javacore.chapter07;

// Объекты передаются по ссылке на них
class Test3 {
    int а, b;

    Test3(int i, int j) {
        а = i;
        b = j;
    }

    // передать объект
    void meth(Test3 о) {
        о.а *= 2;
        о.b /= 2;
    }
}

    class PassObjRe {
        public static void main(String args[]) {
            Test3 ob = new Test3(15, 20);
            System.out.println("ob.a и  оЬ .Ь до вызова:   " + ob.а + "  " + ob.b);
            ob.meth(ob);
            System.out.println("ob.a и  оЬ .Ь после вызова:   " + ob.а + " " + ob.b);
        }
    }
