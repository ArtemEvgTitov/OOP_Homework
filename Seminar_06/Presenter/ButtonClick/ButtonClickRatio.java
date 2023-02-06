package Seminar_06.Presenter.ButtonClick;

import Seminar_06.Console.*;

/**
 * Класс запроса всех чисел одной кнопкой
 */
public class ButtonClickRatio implements IButton {

    View view;
    double x;
    double y;

    @Override
    /**
     * Метод запроса всех чисел одной кнопкой
     */
    public void buttonClick() {
        x = (view.getValue("X"));
        y = (view.getValue("Y"));

    }

}
