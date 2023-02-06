package Seminar_06.Presenter;

import Seminar_06.Console.*;
import Seminar_06.Model.*;
import Seminar_06.Presenter.Runner.RunComplex;
import Seminar_06.Presenter.Runner.RunRatio;

/**
 * Класс с конструктором Presenter
 */
public class Presenter {
    View view;
    CalcModel model;
    ViewChoiceTypeNumber view3;

    public Presenter(CalcModel m, View view2) {
        this.model = m;
        this.view = view2;
    }

    public void run() {
        int choice = view3.getChoice();
        switch (choice) {
            case 1:
                RunRatio r = new RunRatio();
                r.run();
                run();
            case 2:
                RunComplex c = new RunComplex();
                c.run();
                run();
            default:
                run();
        }

    }
}
