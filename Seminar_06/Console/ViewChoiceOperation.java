package Seminar_06.Console;

import java.util.Scanner;

// Класс для выбора операции
public class ViewChoiceOperation implements IVeiw {

    Scanner in = new Scanner(System.in);

    public double getValue(String msg) {
        System.out.print("Введите " + msg + " > ");
        return in.nextDouble();
    }

    @Override
    public int getChoice() {
        System.out.println("\nВыберите операцию:");
        System.out.println("1. Сумма");
        System.out.println("2. Разность");
        System.out.println("3. Умножение");
        System.out.println("4. Деление\n");
        return in.nextInt();
    }
    
}
