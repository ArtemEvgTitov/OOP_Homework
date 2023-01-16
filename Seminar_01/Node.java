package Seminar_01;

import java.util.ArrayList;

public class Node {
    Human human;
    ArrayList<Node> son = new ArrayList<Node>();

    public Node(Human human) {
        this.human = human;
    }

    public String printNode(){
        return human.humanToString();
    }

    public void preOrder(Node tree, String space) {
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
}