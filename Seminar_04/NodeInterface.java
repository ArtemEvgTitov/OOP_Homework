package Seminar_04;

import java.util.ArrayList;
/**
 * Интерфейс создания узла
 */
public interface NodeInterface<T,R> {
    String printNode();
    void preOrder(T tree, R space);
    void children(ArrayList<T> x);
}
