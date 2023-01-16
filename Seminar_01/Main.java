package Seminar_01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Human h1 = new Human("Иван", 1911);
        Node root = new Node(h1);

        Human h2 = new Human("Сергей");
        Human h3 = new Human(1943);
        Node n2 = new Node(h2);
        Node n3 = new Node(h3);

        Human h4 = new Human("Екатерина", 1966);
        Human h5 = new Human("Петров Олег", 1970);
        Human h6 = new Human("Ниткин Дмитрий", 1969);
        Node n4 = new Node(h4);
        Node n5 = new Node(h5);
        Node n6 = new Node(h6);

        Human h7 = new Human("Лобов Юрий", 1990);
        Human h8 = new Human("Зубков Илья", 1991);
        Human h9 = new Human("Зуев Станислав", 1988);
        Human h10 = new Human("Редин Георгий", 1990);
        Human h11 = new Human("Досов Денис", 1992);
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