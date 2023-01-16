package Seminar_01;

import java.util.ArrayList;

public class Node {
    Human human;
    ArrayList<Node> son = new ArrayList<Node>();

    public Node(Human human) {
        this.human = human;
    }

    public String printNode() {
        return human.humanToString();
    }

    static void preOrder(Node tree, String space) {
        if (tree != null)
            System.out.println(space + tree.human.humanToString());
        else {
            System.out.println(space + "nil");
            return;
        }

        for (int i = 0; i < tree.son.size(); i++) {
            preOrder(tree.son.get(i), space + " * ");
        }
    }

    static void children(ArrayList<Node> x) {
        if (x.size() == 0) {
            System.out.println("Отсутствуют");
        } else {
            for (int i = 0; i < x.size(); i++) {
                System.out.println(x.get(i).printNode());
            }
        }
    }
}
