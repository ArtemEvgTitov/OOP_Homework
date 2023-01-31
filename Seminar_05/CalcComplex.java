package Seminar_05;

public class CalcComplex<T> extends CalcModel<T> {

    Complex sum(Complex a) {
        double real = a.getReal();
        double image = a.getImage();
        double real2 = a.getReal();
        double image2 = a.getImage();
        double newReal = real + real2;
        double newImage = image + image2;

        Complex result = new Complex(newReal, newImage);
        return result;
    }
}
