package Seminar_05;

public interface Model<T> {

    T sum(T a, T b);

    T sub();

    T mult();

    T div();

    void setA(T value);

    void setB(T value);

}
