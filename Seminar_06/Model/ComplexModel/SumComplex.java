package Seminar_06.Model.ComplexModel;

import Seminar_06.Model.CalcModel;
/**
 * Класс для рассчёта суммы комплексных чисел
 */
public class SumComplex extends CalcModel {

    @Override
    public double result(double x, double y) {
        return x + y;
    }

    public Complex resultComplex(double x1, double x2, double y1, double y2) {
        double newReal = result(x1, x2);
        double newImage = result(y1, y2);
        Complex result = new Complex(newReal, newImage);
        return result;
    }
}
