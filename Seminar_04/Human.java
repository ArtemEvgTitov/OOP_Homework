package Seminar_04;

public class Human<T, R> implements HumanInterface<T, R> {
    private T name;
    private R year;

    Human(T name, R year){
        this.name = name;
        this.year = year;
    }

    Human() {
        this.name = null;
        this.year = null;
    }

    @Override
    public T getName() {
        return name;
    }

    @Override
    public void setName(T name) {
        this.name = name;
    }

    @Override
    public R getBirthday() {
        return year;
    }

    @Override
    public void setBirthday(R year) {
        this.year = year;
    }

    @Override
    public String humanToString() {
        return name + " " + year;
    }
}
