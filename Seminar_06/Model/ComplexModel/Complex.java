package Seminar_06.Model.ComplexModel;
/**
 * Класс Coplex. Содержит конструктор Complex(double x, double y), методы получения X и Y, а также метод печати Комплексного числа
 */
public class Complex {

    double x;
    double y;

    Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void print() {
        if (y > 0) {
            System.out.println(x + " + " + y + "i");
        } else if (y < 0) {
            System.out.println(x + "" + y + "i");
        } else {
            System.out.println(x);
        }
    }
}
