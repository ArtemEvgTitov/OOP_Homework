package Seminar_04;

public class Human<T> implements HumanInterface<T> {
    private T name;
    private T year;

    @Override
    public T getName() {
        return name;
    }

    @Override
    public void setName(T name) {
        this.name = name;
    }

    @Override
    public T getBirthday() {
        return year;
    }

    @Override
    public void setBirthday(T year){
        this.year = year;
    }

    @Override
    public String humanToString(){
        return name + " " + year;
    }
}
