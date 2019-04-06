package com.iliabvf.javacore.chapter08;

// Применение абстрактнbх методов и  классов 
abstract class Figure2 {
    double diml;
    double dim2;

    Figure2(double а, double b) {
        diml = а;
        dim2 = b;
    }

    // теперь метод area() объявляется абстрактнbb 
    abstract double area();
}
    
class Rectangle2 extends Figure2 {
    Rectangle2(double а, double Ь) {
        super(а, Ь); // переопределить метод area() для четbрехугольника
    }

    double area() {
        System.out.println("B  области четbрехугольника.");
        return diml * dim2;
    }
}

class Triangle2 extends Figure2 {
    Triangle2(double a, double Ь) {
        super(a, Ь);
    }

    // переопределить метод area() для прямоугольного треугольника
    double area() {
        System.out.println("B  области треугольника.");
        return diml * dim2 / 2;
    }
}

class AЬstractAreas {
    public static void main(String args[]) {
        //Figure2 f = new Figure2(10, 10);
        //теперь недопустимо
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref; // верно,   но объект не создается
        figref = r;
        System.out.println("Плoщaдь равна" + figref.area());
        figref = t;
        System.out.println("Плoщaдь равна " + figref.area());
    }
}