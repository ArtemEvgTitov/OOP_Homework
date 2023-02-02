package Seminar_05.Presenter;

import Seminar_05.Console.View;
import Seminar_05.Model.*;
import Seminar_05.Model.ComplexModel.DivComplex;
import Seminar_05.Model.ComplexModel.MultComplex;
import Seminar_05.Model.ComplexModel.SubComplex;
import Seminar_05.Model.ComplexModel.SumComplex;
import Seminar_05.Model.RationalModel.DivCalc;
import Seminar_05.Model.RationalModel.MultCalc;
import Seminar_05.Model.RationalModel.SubCalc;
import Seminar_05.Model.RationalModel.SumCalc;


public class Presenter {
    View view;
    CalcModel model;
    double x, x1, x2;
    double y, y1, y2;

    public Presenter(CalcModel m, View v) {
        this.model = m;
        this.view = v;
    }

    public void showValue(double value) {
        System.out.println("\nРезультат = " + value);
    }

    public void buttonClick() {
        x = (view.getValue("X"));
        y = (view.getValue("Y"));
    }

    public void buttonClickComplex() {
        x1 = (view.getValue("X1"));
        x2 = (view.getValue("X2"));
        y1 = (view.getValue("Y1"));
        y2 = (view.getValue("Y2"));

    }

    public void runRatio() {
        int choice = view.getChoice();
        this.buttonClick();
        switch (choice) {
            case 1 -> showValue(new SumCalc().result(x, y));
            case 2 -> showValue(new SubCalc().result(x, y));
            case 3 -> showValue(new MultCalc().result(x, y));
            case 4 -> showValue(new DivCalc().result(x, y));
            default -> runOperation();  
        }
    }

    public void runComplex() {
        int choice = view.getChoice();
        this.buttonClickComplex();
        switch (choice) {
            case 1 -> (new SumComplex().resultComplex(x1, x2, y1, y2)).print();
            case 2 -> (new SubComplex().resultComplex(x1, x2, y1, y2)).print();
            case 3 -> (new MultComplex().resultComplex(x1, x2, y1, y2)).print();
            case 4 -> (new DivComplex().resultComplex(x1, x2, y1, y2)).print();
            default -> runOperation();    
        }
    }

    public void runOperation() {
        int choiceOne = view.getChoiceOne();
        switch (choiceOne) {
            case 1:
                runRatio();
                runOperation();
            case 2:
                runComplex();
                runOperation();
            default:
                runOperation();
        }
    }
}
