package Seminar_06.Presenter.ButtonClick;

import Seminar_06.Console.*;

/**
 * Класс запроса всех чисел одной кнопкой
 */
public class ButtonClickComplex implements IButton {

    View view;
    double x1, x2;
    double y1, y2;

    @Override
    /**
     * Метод запроса всех чисел одной кнопкой
     */
    public void buttonClick() {
        x1 = (view.getValue("X1"));
        x2 = (view.getValue("X2"));
        y1 = (view.getValue("Y1"));
        y2 = (view.getValue("Y2"));

    }

}
