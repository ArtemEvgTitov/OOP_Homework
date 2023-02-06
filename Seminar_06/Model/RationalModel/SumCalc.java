package Seminar_06.Model.RationalModel;

import Seminar_06.Model.CalcModel;
/**
 * Класс для рассчёта суммы рациональных чисел
 */
public class SumCalc extends CalcModel {

    @Override
    public double result(double x, double y) {
        return x + y;
    }
}
