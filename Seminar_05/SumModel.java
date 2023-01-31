package Seminar_05;

public class SumModel<T> extends CalcModel<T> {

    T result;

    @Override
    public T result() {
        return result;
    }

    @Override
    public void setA(T value) {
        super.x = value;

    }

    @Override
    public void setB(T value) {
        super.y = value;

    }

}
