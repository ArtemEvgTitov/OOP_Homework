package Seminar_05;

import java.util.Scanner;

public class Complex {

    double real;
    double image;

    Complex() {
        try (Scanner input = new Scanner(System.in)) {
            double real = input.nextDouble();
            double image = input.nextDouble();
            ComplexInput(real, image);
        }
    }

    private void ComplexInput(double real, double image) {
        this.real = real;
        this.image = image;
    }

    Complex(double real, double image) {
        this.real = real;
        this.image = image;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImage() {
        return image;
    }

    public void setImage(double image) {
        this.image = image;
    }

}
