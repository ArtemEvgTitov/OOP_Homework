package Seminar_06.Presenter;

import Seminar_06.Console.*;
import Seminar_06.Model.*;

public class Presenter {
    View view;
    CalcModel model;

    public Presenter(CalcModel m, View v) {
        this.model = m;
        this.view = v;
    }
}
