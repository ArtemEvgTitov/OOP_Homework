package Seminar_06;

import Seminar_05.Console.View;
import Seminar_05.Model.RationalModel.SumCalc;
import Seminar_05.Presenter.Presenter;

public class Main {
    public static void main(String[] args) {
        Presenter app = new Presenter(new SumCalc(), new View());
        app.runOperation();
    }
}
