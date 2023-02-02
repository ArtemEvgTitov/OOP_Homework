package Seminar_05.Model.ComplexModel;

import Seminar_05.Model.CalcModel;

public class SumComplex extends CalcModel {

    @Override
    public double result(double x, double y) {
        return x + y;
    }

    public Complex resultComplex(double x1, double x2, double y1, double y2){
        double newReal = result(x1, x2);
        double newImage = result(y1, y2);
		Complex result = new Complex(newReal,newImage);
		return result;  
    }
}
