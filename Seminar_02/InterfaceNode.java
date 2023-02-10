package Seminar_02;

import java.util.ArrayList;

/**
 * Интерфейс создания узла дерева
 */
public interface InterfaceNode {
    String printNode();

    void preOrder(Node tree, String space);

    void children(ArrayList<Node> x);
}
