package Seminar_06.Presenter.Runner;

import Seminar_06.Presenter.ButtonClick.ButtonClickRatio;

import Seminar_06.Console.*;
import Seminar_06.Model.RationalModel.DivCalc;
import Seminar_06.Model.RationalModel.MultCalc;
import Seminar_06.Model.RationalModel.SubCalc;
import Seminar_06.Model.RationalModel.SumCalc;

public class RunRatio extends ButtonClickRatio implements IRunner {

    View view;
    double x;
    double y;

    @Override
    public void run() {
        int choice = view.getChoice();
        this.buttonClick();
        switch (choice) {
            case 1 -> System.out.println((new SumCalc().result(x, y)));
            case 2 -> System.out.println((new SubCalc().result(x, y)));
            case 3 -> System.out.println((new MultCalc().result(x, y)));
            case 4 -> System.out.println((new DivCalc().result(x, y)));

        }

    }
}
