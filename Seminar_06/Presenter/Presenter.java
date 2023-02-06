package Seminar_06.Presenter;

import Seminar_06.Console.*;
import Seminar_06.Model.*;

/**
 * Класс с конструктором Presenter
 */
public class Presenter {
    ViewModel view;
    CalcModel model;

    public Presenter(CalcModel m, ViewModel v) {
        this.model = m;
        this.view = v;
    }
}
