package Seminar_05;

import Seminar_05.Console.View;
import Seminar_05.Model.RationalModel.SumCalc;
import Seminar_05.Presenter.Presenter;
import java.util.logging.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.info("Start program");

        Presenter app = new Presenter(new SumCalc(), new View());
        app.runOperation();
    }
}
