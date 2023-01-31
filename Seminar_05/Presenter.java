package Seminar_05;

public class Presenter<T extends CalcComplex> {
    
    View view;
    CalcComplex<Complex> model;

    public Presenter(CalcComplex calcComplex, View view2) {
        model = calcComplex;
        view = view2;
    }

    public void buttonClick(){
        Complex a = view.getValue("A: ");
        Complex b = view.getValue("B: ");
        a.printComplex();
        b.printComplex();
        // model.setA(a);
        // model.setB(b);
        Complex result = model.sum(a, b);
        result.printComplex();
    }
}
