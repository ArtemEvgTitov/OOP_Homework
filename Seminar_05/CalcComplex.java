package Seminar_05;

public class CalcComplex<T> extends CalcModel<T> {

    Complex sum(Complex a, Complex b) {
        double real = a.getReal();
        double image = a.getImage();
        double real2 = b.getReal();
        double image2 = b.getImage();
        double newReal = real + real2;
        double newImage = image + image2;

        Complex result = new Complex(newReal, newImage);
        return result;
    }
}
