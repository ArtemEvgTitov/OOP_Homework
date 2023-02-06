package Seminar_06.Console;

import java.util.Scanner;

// Класс для выбора типа числа
public class ViewChoiceTypeNumber implements IVeiw {

    Scanner in = new Scanner(System.in);

    public double getValue(String msg) {
        System.out.print("Введите " + msg + " > ");
        return in.nextDouble();
    }

    @Override
    public int getChoice() {
        System.out.println("\nС какими числами хотите работать:");
        System.out.println("1. Рациональные");
        System.out.println("2. Комплексные");
        return in.nextInt();
    }
    
}
