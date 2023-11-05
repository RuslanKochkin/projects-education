import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
// 1
//Создать в программе 3 класса: Square{double side}, Circle{double radius},
// Rectangle{double sideA, double sideB }.
//У каждого класса реализовать метод double callcArea(), который считает площадь фигуры.
// Создать List из фигур и для каждой фигуры вывести на экран ее площадь.
// 2 (напоминание)
//Написать метод, который входит в список самой фигуры с большой площадью.

        Square s1 = new Square(4);
        Rectangle r1 = new Rectangle(3, 4);
        Circle c1 = new Circle(3);
        System.out.println(s1.calcArea());
        System.out.println(r1.calcArea());
        System.out.println(c1.calcArea());
        List<Double> figure = new ArrayList<>();
        figure.add(s1.calcArea());
        figure.add(r1.calcArea());
        figure.add(c1.calcArea());
        System.out.println(figureOfMax(figure));

    }

    public static double figureOfMax(List<Double>figure) {
        double max = figure.get(0);
        for (Double i :figure) {
            if ( i > max) {
                max = i;
            }
        }
        return max;
    }
}
