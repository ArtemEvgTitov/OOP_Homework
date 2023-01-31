package Seminar_05;

public class CalcModel<T> implements Model<T> {

    T x, y, result;

    @Override
    public T sum() {
        return result;
    }

    @Override
    public T sub() {
        return result;
    }

    @Override
    public T mult() {
        return result;
    }

    @Override
    public T div() {
        return result;
    }

    @Override
    public void setA(T value) {
        x = value;

    }

    @Override
    public void setB(T value) {
        y = value;

    }
}
