package Seminar_05;

import java.util.Scanner;

public class View {

    Scanner input = new Scanner(System.in);
    
    public Complex getValue(String title){
        System.out.printf("%s", title);
        double real = input.nextDouble();
        System.out.printf("%s", title);
        double image = input.nextDouble();
        Complex a = new Complex(real, image);
        return a;
    }
}
