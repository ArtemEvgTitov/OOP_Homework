package Seminar_05;

public class Main {
    public static void main(String[] args) {
        Presenter p = new Presenter(new CalcComplex<>(), new View());
        p.buttonClick();
    }
}
