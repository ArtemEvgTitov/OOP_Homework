package Seminar_06.Presenter.Runner;

import Seminar_06.Console.*;
import Seminar_06.Model.ComplexModel.DivComplex;
import Seminar_06.Model.ComplexModel.MultComplex;
import Seminar_06.Model.ComplexModel.SubComplex;
import Seminar_06.Model.ComplexModel.SumComplex;
import Seminar_06.Presenter.ButtonClick.ButtonClickComplex;

/**
 * Класс запуска для комплексных чисел
 */
public class RunComplex extends ButtonClickComplex implements IRunner {

    ViewModel view;
    double x1, x2;
    double y1, y2;

    @Override
    public void run() {
        int choice = view.getChoice();
        this.buttonClick();
        switch (choice) {
            case 1 -> (new SumComplex().resultComplex(x1, x2, y1, y2)).print();
            case 2 -> (new SubComplex().resultComplex(x1, x2, y1, y2)).print();
            case 3 -> (new MultComplex().resultComplex(x1, x2, y1, y2)).print();
            case 4 -> (new DivComplex().resultComplex(x1, x2, y1, y2)).print();
        }

    }

}
