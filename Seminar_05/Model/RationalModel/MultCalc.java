package Seminar_05.Model.RationalModel;

import Seminar_05.Model.CalcModel;

public class MultCalc extends CalcModel {
    @Override
    public double result(double x, double y) {
        return x * y;
    }
}