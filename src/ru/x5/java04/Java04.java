package ru.x5.java04;

public class Java04 {

    //Задание 1
    //1.Создать интерфейс Shape с методом square, который возвращает площадь фигуры.
    //2.Создать классы: Circle, Triangle, Rectangle реализующие этот интерфейс
    //3.Метод main  должен выглядеть так:

    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(2.0, 3.0, 4.0);
        shape[1] = new Circle(2.0);
        shape[2] = new Rectangle(2.0, 3.0);
        for (Shape sh : shape) {
            System.out.println("Площадь фигуры: " + sh.square());
        }
    }

}
