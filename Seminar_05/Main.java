package Seminar_05;

import Seminar_05.Console.View;
import Seminar_05.Model.SumCalc;
import Seminar_05.Presenter.Presenter;

public class Main {
    public static void main(String[] args) {
        Presenter app = new Presenter(new SumCalc(), new View());
        app.runOperation();
    }
}
