package Seminar_01;

import java.util.ArrayList;

public class Node {
    Human human;
    ArrayList<Node> son = new ArrayList<Node>();

    public Node(Human human) {
        this.human = human;
    }
}




