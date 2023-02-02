package Seminar_05.Presenter;

import Seminar_05.Console.View;
import Seminar_05.Model.*;
import Seminar_05.Model.RationalModel.DivCalc;
import Seminar_05.Model.RationalModel.MultCalc;
import Seminar_05.Model.RationalModel.SubCalc;
import Seminar_05.Model.RationalModel.SumCalc;

public class Presenter {
    View view;
    // CalcModel model;
    double x;
    double y;

    public Presenter(CalcModel m, View v) {
        // this.model = m;
        this.view = v;
    }

    public void buttonClick() {
        x = (view.getValue("X"));
        y = (view.getValue("Y"));
    }

    public void runOperation() {
        int choiceOne = view.getChoiceOne();
        int choice = view.getChoice();
        this.buttonClick();
        switch (choiceOne) {
            case 1:
                switch (choice) {
                    case 1 -> System.out.println(new SumCalc().result(x, y));
                    case 2 -> System.out.println(new SubCalc().result(x, y));
                    case 3 -> System.out.println(new MultCalc().result(x, y));
                    case 4 -> System.out.println(new DivCalc().result(x, y));
                }
        }
    }
}
