package Seminar_06;

import Seminar_06.Console.View;
import Seminar_06.Model.RationalModel.SumCalc;
import Seminar_06.Presenter.Presenter;


public class Main {
    public static void main(String[] args) {
        Presenter app = new Presenter(new SumCalc(), new View());
        app.run();
    }
}

