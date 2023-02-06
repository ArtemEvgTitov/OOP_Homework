package Seminar_06.Model.RationalModel;

import Seminar_06.Model.CalcModel;

/**
 * Класс для рассчёта деления рациональных чисел
 */
public class DivCalc extends CalcModel {
    @Override
    public double result(double x, double y) {
        return x / y;
    }
}