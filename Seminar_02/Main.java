package Seminar_02;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        Consumer<Family> print = x -> System.out.println(x.getName());
        Supplier<Family> humanFactory = () -> {

            Scanner in = new Scanner(System.in);
            System.out.print("Введите имя: ");
            String name = in.nextLine();
            System.out.print("Введите год: ");
            int year = in.nextInt();
            return new Family(name, year);
        };

        System.out.println("Введите первого родственника");
        Family h1 = humanFactory.get();
        Node root = new Node(h1);

        System.out.println("Введите следующего родственника после");
        print.accept(h1);
        Family h2 = new Family(humanFactory.get(), h1);
        Family h3 = new Family(1943, h1);
        Node n2 = new Node(h2);
        Node n3 = new Node(h3);

        System.out.println("Введите следующего родственника после");
        print.accept(h2);
        Family h4 = new Family(humanFactory.get(), h2);
        Family h5 = new Family("Петров Олег", 1970, h3);
        Family h6 = new Family("Ниткин Дмитрий", 1969, h3);
        Node n4 = new Node(h4);
        Node n5 = new Node(h5);
        Node n6 = new Node(h6);

        Family h7 = new Family("Лобов Юрий", 1990, h4);
        Family h8 = new Family("Зубков Илья", 1991, h4);
        Family h9 = new Family("Зуев Станислав", 1988, h4);
        Family h10 = new Family("Редин Георгий", 1990, h6);
        Family h11 = new Family("Досов Денис", 1992, h6);
        Node n7 = new Node(h7);
        Node n8 = new Node(h8);
        Node n9 = new Node(h9);
        Node n10 = new Node(h10);
        Node n11 = new Node(h11);

        ArrayList<Node> temp_array_root = new ArrayList<Node>();
        temp_array_root.add(n2);
        temp_array_root.add(n3);
        root.son = temp_array_root;

        ArrayList<Node> temp_array_n2 = new ArrayList<Node>();
        temp_array_n2.add(n4);
        n2.son = temp_array_n2;

        ArrayList<Node> temp_array_n3 = new ArrayList<Node>();
        temp_array_n3.add(n5);
        temp_array_n3.add(n6);
        n3.son = temp_array_n3;

        ArrayList<Node> temp_array_n4 = new ArrayList<Node>();
        temp_array_n4.add(n7);
        temp_array_n4.add(n8);
        temp_array_n4.add(n9);
        n4.son = temp_array_n4;

        ArrayList<Node> temp_array_n6 = new ArrayList<Node>();
        temp_array_n6.add(n10);
        temp_array_n6.add(n11);
        n6.son = temp_array_n6;

        System.out.println("\n------ Всё древо ------");
        root.preOrder(root, "- ");
        System.out.println("\n------ Все родственики после ------");
        n4.preOrder(n4, "- ");
        System.out.println("\n-----------------------");
        System.out.println("Отец/мать у: " + h1.humanToString());
        System.out.println(h1.prewToString());
        System.out.println("\n-----------------------");
        System.out.println("Дети у: " + h3.humanToString());
        n3.children(n3.son);
    }
}
