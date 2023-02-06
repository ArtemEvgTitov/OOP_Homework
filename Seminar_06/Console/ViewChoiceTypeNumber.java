package Seminar_06.Console;

import java.util.Scanner;

/**
 * Класс для выбора типа числа
 */
public class ViewChoiceTypeNumber implements IVeiw, IGetValue {

    Scanner in = new Scanner(System.in);

    @Override
    /**
     * Метод запроса ввода от пользователя
     */
    public double getValue(String msg) {
        System.out.print("Введите " + msg + " > ");
        return in.nextDouble();
    }

    @Override
    /**
     * Метод запроса типа числа
     */
    public int getChoice() {
        System.out.println("\nС какими числами хотите работать:");
        System.out.println("1. Рациональные");
        System.out.println("2. Комплексные");
        return in.nextInt();
    }

}
