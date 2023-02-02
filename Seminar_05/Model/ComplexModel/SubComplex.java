package Seminar_05.Model.ComplexModel;

import Seminar_05.Model.CalcModel;

public class SubComplex extends CalcModel {
    @Override
    public double result(double x, double y) {
        return x - y;
    }
}
