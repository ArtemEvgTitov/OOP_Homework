package Seminar_05.Console;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public double getValue(String msg) {
        System.out.print("Введите " + msg + " > ");
        return in.nextDouble();
    }

    public int getChoice() {
        System.out.println("\nВыберите операцию:");
        System.out.println("1. Сумма");
        System.out.println("2. Разность");
        System.out.println("3. Умножение");
        System.out.println("4. Деление\n");
        return in.nextInt();
    }

    public int getChoiceOne() {
        System.out.println("\nС какими числами хотите работать:");
        System.out.println("1. Рациональные");
        System.out.println("2. Комплексные");
        return in.nextInt();
    }
}
