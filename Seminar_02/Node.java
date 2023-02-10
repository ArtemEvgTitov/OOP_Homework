package Seminar_02;

import java.util.ArrayList;

public class Node implements InterfaceNode {
    Family human;
    ArrayList<Node> son = new ArrayList<Node>();

    public Node(Family human) {
        this.human = human;
    }

    @Override
    public String printNode() {
        return human.humanToString();
    }

    @Override
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

    @Override
    public void children(ArrayList<Node> x) {
        if (x.size() == 0) {
            System.out.println("Отсутствуют");
        } else {
            for (int i = 0; i < x.size(); i++) {
                System.out.println(x.get(i).printNode());
            }
        }
    }

}
