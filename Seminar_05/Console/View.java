package Seminar_05.Console;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public double getValue(String msg) {
        System.out.print("Введите " + msg + " > ");
        return in.nextDouble();
    }

    public void showValue(String msg, double value) {
        System.out.println(msg + value);
    }

    public int getChoice() {
        System.out.println("Выберите операцию:");
        System.out.println("\t1. Сумма");
        System.out.println("\t2. Разность");
        System.out.println("\t3. Умножение");
        System.out.println("\t4. Деление");
        return in.nextInt();
    }

    public int getChoiceOne() {
        System.out.println("С какими числами хотите работать:");
        System.out.println("\t1. Рациональные");
        System.out.println("\t2. Комплексные");
        return in.nextInt();
    }

}
