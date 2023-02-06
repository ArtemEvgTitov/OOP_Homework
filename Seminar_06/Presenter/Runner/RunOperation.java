package Seminar_06.Presenter.Runner;

import Seminar_06.Console.*;

public class RunOperation implements IRunner {

    View view;

    @Override
    public void run() {
        int choice = view.getChoice();
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
