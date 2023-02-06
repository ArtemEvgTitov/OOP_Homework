package Seminar_06.Presenter.ButtonClick;

import Seminar_06.Console.*;

public class ButtonClickRatio implements IButton {

    View view;
    double x;
    double y;

    @Override
    public void buttonClick() {
        x = (view.getValue("X"));
        y = (view.getValue("Y"));
        
    }
    
}
