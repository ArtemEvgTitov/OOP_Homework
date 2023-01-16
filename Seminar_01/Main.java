package Seminar_01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Family h1 = new Family("Иван", 1911);
        Node root = new Node(h1);

        Family h2 = new Family("Сергей", h1);
        Family h3 = new Family(1943, h1);
        Node n2 = new Node(h2);
        Node n3 = new Node(h3);

        Family h4 = new Family("Екатерина", 1966);
        Family h5 = new Family("Петров Олег", 1970);
        Family h6 = new Family("Ниткин Дмитрий", 1969);
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

        preOrder(root, "-");
        System.out.println();
    }

    static void preOrder(Node tree, String space) {
        if (tree != null)
            System.out.println(space + tree.human);
        else {
            System.out.println(space + "nil");
            return;
        }
    
        for (int i = 0; i < tree.son.size(); i++) {
            preOrder(tree.son.get(i), space + " * ");
        }

    }    
}